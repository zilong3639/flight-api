package com.example.flightapi.service.impl;

import com.example.flightapi.controller.dto.LoginRequestDto;
import com.example.flightapi.controller.dto.LoginResponseDto;
import com.example.flightapi.entity.UserEntity;
import com.example.flightapi.repository.UserRepository;
import com.example.flightapi.service.LoginService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements  LoginService {

    private final UserRepository userRepository;
    
    public LoginServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
      }
    
    public LoginResponseDto login(LoginRequestDto loginRequestDto) throws Exception {
    	UserEntity userEntity = userRepository.findByEmail(loginRequestDto.getEmail());

        if (userEntity == null ) {
            throw new Exception("User not found");
        }
        if (!loginRequestDto.getPassword().equals(userEntity.getPassword())) {
            throw new Exception("Invalid password");
        }
        LoginResponseDto loginResponseDto  = new LoginResponseDto();
        BeanUtils.copyProperties(userEntity, loginResponseDto);
        loginResponseDto.setUsername(userEntity.getFirstName()+userEntity.getLastName());
		return loginResponseDto;
            
    };
    
    public LoginResponseDto getUserInfo(LoginRequestDto loginRequestDto) throws Exception  {
    	UserEntity userEntity = userRepository.findByEmail(loginRequestDto.getEmail());

        if (userEntity == null ) {
            throw new Exception("User not found");
        }
        LoginResponseDto loginResponseDto  = new LoginResponseDto();
        BeanUtils.copyProperties(userEntity, loginResponseDto);
        loginResponseDto.setUsername(userEntity.getFirstName()+userEntity.getLastName());
		return loginResponseDto;
    	
    };
    
    public void register(LoginRequestDto loginRequestDto) throws Exception {
    	UserEntity userEntity = userRepository.findByEmail(loginRequestDto.getEmail());

        if (userEntity != null ) {
            throw new Exception("Username already exists");
        }
        UserEntity userNew = new UserEntity();
        userNew.setFirstName(loginRequestDto.getFirstName());
        userNew.setLastName(loginRequestDto.getLastName());
        userNew.setPassword(loginRequestDto.getPassword());
        userNew.setEmail(loginRequestDto.getEmail());
        userNew.setPhone(loginRequestDto.getPhone());
        userNew.setCountry (loginRequestDto.getCountry());
        userRepository.save(userNew);
        
    	
    };
    
    public void updatePassword(LoginRequestDto loginRequestDto) throws Exception  {
    	UserEntity userEntity = userRepository.findByEmail(loginRequestDto.getEmail());

        if (userEntity == null ) {
            throw new Exception("User not found");
        }
        userEntity.setPassword(loginRequestDto.getPassword());
        userRepository.save(userEntity);
    };
}
