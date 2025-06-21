package com.example.flightapi.controller.dto;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class FlightRequestDto {
  private String departureAirportCode;
  private String destinationAirportCode;
  private LocalDate date;
}
