
package com.example.flightapi.service;

import com.example.flightapi.controller.dto.LoginRequestDto;
import com.example.flightapi.controller.dto.LoginResponseDto;

public interface LoginService {
    
    LoginResponseDto login(LoginRequestDto loginRequestDto) throws Exception;
    LoginResponseDto getUserInfo(LoginRequestDto loginRequestDto) throws Exception;
    void register(LoginRequestDto loginRequestDto) throws Exception;
    void updatePassword(LoginRequestDto loginRequestDto) throws Exception;
}
