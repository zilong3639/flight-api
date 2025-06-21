package com.example.flightapi.controller;


import com.example.flightapi.controller.dto.LoginRequestDto;
import com.example.flightapi.controller.dto.LoginResponseDto;
import com.example.flightapi.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class LoginController {
    @Autowired
    private LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDto> login(@RequestBody LoginRequestDto loginRequest) {

        try{
            return ResponseEntity.ok(loginService.login(loginRequest));
    	}catch(Exception e) {
    		ResponseEntity.badRequest().body(e.getMessage());
            return ResponseEntity.ok(null);
    	}
    }

    @GetMapping("/userInfo")
    public ResponseEntity<LoginResponseDto> getUserInfo(
            @RequestBody LoginRequestDto request) {
        try{
        	
            return ResponseEntity.ok(loginService.getUserInfo(request));
    	}catch(Exception e) {
    		ResponseEntity.badRequest().body(e.getMessage());
            return ResponseEntity.ok(null);
    	}
    }

    @PostMapping("/register")
    @Transactional
    public ResponseEntity<String> register(@RequestBody LoginRequestDto registerRequest) {

        try{
        	loginService.register(registerRequest);
            return ResponseEntity.ok("User registered successfully");
    	}catch(Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
    	}
    }

    @PostMapping("/updatePwd")
    public ResponseEntity<String> updatePassword(
            @RequestBody LoginRequestDto request) {
        
        try{
        	loginService.updatePassword(request);
            return ResponseEntity.ok("Password updated successfully");
    	}catch(Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
    	}
        
    }
}
