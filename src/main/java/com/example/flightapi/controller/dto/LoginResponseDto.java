package com.example.flightapi.controller.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginResponseDto {
	  private Long userId;
	  private String username;
	  private String phone;
	  private String email;
	  private String country;
  
}
