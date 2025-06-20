package com.example.flightapi.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserInfo {

    private Long id;

    private String email;

    private String firstName;

    private String lastName;

    private String country;

    private String phone;

    private String access_token;

    private String expires_in;
}
