package com.example.flightapi.controller.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserInfoResponseDto {
  private String username;
  private String phone;
  private String email;
  private String country;
}
