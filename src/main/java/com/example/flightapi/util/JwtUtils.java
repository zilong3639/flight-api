package com.example.flightapi.util;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import java.util.Map;

public class JwtUtils
{

    public static String createToken(Map<String, Object> claims)
    {
        byte[] secretKey = Keys.secretKeyFor(SignatureAlgorithm.HS512).getEncoded();
        return Jwts.builder().setClaims(claims).signWith(SignatureAlgorithm.HS512, secretKey).compact();
    }
}
