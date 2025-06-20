package com.example.flightapi.controller;

import com.example.flightapi.dto.AjaxResult;
import com.example.flightapi.dto.LoginDTO;
import com.example.flightapi.dto.RegisterDTO;
import com.example.flightapi.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@Tag(name = "用户认证")
public class AuthController  extends BaseController{

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    @Operation(summary = "用户登录")
    public AjaxResult login(@RequestBody @Validated LoginDTO loginDto) {

        return  userService.login(loginDto);
    }

    @PostMapping("/register")
    @Operation(summary = "用户注册")
    public AjaxResult register(@RequestBody @Validated RegisterDTO registerDto) {
        return AjaxResult.success(userService.registerUser(registerDto));
    }
}

