package com.example.flightapi.service;

import com.example.flightapi.constant.HttpStatus;
import com.example.flightapi.dto.AjaxResult;
import com.example.flightapi.dto.LoginDTO;
import com.example.flightapi.dto.RegisterDTO;
import com.example.flightapi.dto.UserInfo;
import com.example.flightapi.entity.UserEntity;
import com.example.flightapi.repository.UserRepository;
import com.example.flightapi.util.BeanUtils;
import com.example.flightapi.util.StringUtils;
import jakarta.servlet.http.HttpSession;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;


@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TokenService tokenService;

    public AjaxResult registerUser(RegisterDTO dto) {
        if(userRepository.existsByEmail(dto.getEmail())) {
            return AjaxResult.error(HttpStatus.CONFLICT, "邮箱地址已经存在！");
        }
        UserEntity user = new UserEntity();
        UserInfo userInfo = new UserInfo();
        BeanUtils.copyBeanProp(user, dto);
        BeanUtils.copyBeanProp(userInfo, dto);
        if(StringUtils.isNull(userRepository.save(user))) {
            return AjaxResult.error(HttpStatus.CONFLICT);

        }
        return AjaxResult.success(HttpStatus.CREATED,tokenService.createToken(userInfo));
    }

    public AjaxResult login(LoginDTO loginDto) {
        UserEntity userInfo = userRepository.findByEmailAndPassword(loginDto.getEmail(), loginDto.getPassword());
        if (StringUtils.isNull(userInfo)) {
            return AjaxResult.error(HttpStatus.UNAUTHORIZED, "用户不存在！");
        }
        UserInfo info = new UserInfo();
        BeanUtils.copyBeanProp(info, userInfo);
        HttpSession session =  ((ServletRequestAttributes)
                RequestContextHolder.getRequestAttributes())
                .getRequest().getSession();
        session.setAttribute("userInfo", info);
        return AjaxResult.success(tokenService.createToken(info));
    }
}
