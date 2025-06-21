package com.example.flightapi.controller.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AirportResponseDto {
    private Long airport_id;
    private String airport_code;
    private String airport_name;
    private String city;

}
