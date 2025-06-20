package com.example.flightapi.service;

import com.example.flightapi.constant.Constants;
import com.example.flightapi.dto.UserInfo;
import com.example.flightapi.util.JwtUtils;
import com.example.flightapi.util.UUID;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;


@Service
public class TokenService {

    public UserInfo createToken(UserInfo userInfo)
    {
        String token = UUID.fastUUID().toString();

        // Jwt存储信息
        Map<String, Object> claimsMap = new HashMap<String, Object>();
        claimsMap.put("user_key", token);
        claimsMap.put("user_id", userInfo.getId());
        claimsMap.put("email", userInfo.getEmail());

        userInfo.setAccess_token(JwtUtils.createToken(claimsMap));
        userInfo.setExpires_in(String.valueOf(Constants.EXPIRATION));
        return userInfo;
    }
}
