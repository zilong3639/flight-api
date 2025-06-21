package com.example.flightapi.controller.dto;


import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
public class FlightResponseDto {
  private Integer page = 1;
  private Integer pageSize = 10;
  
  private Long flight_id;
  private String flight_number;
  private String departure_airport_id;
  private String destination_airport_id;
  private String departureAirportName;
  private String destinationAirportName;
  private LocalDateTime departure_time;
  private LocalDateTime destination_time;
  private BigDecimal economy_price;
  private BigDecimal business_price;
}
