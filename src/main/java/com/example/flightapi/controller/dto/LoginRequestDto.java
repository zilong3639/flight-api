package com.example.flightapi.controller.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginRequestDto {
  private String email;
  private String password;
  private String token;
  private String firstName;
  private String lastName;
  private String phone;
  private String country;
}
