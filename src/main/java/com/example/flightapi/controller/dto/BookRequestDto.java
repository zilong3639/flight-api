package com.example.flightapi.controller.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class BookRequestDto {
 
    private Long user_id;
 
    private Long flight_id;
 
    private BigDecimal total_price;
 
    private String contact_phone;
}
