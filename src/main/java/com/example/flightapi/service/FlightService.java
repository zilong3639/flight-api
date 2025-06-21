package com.example.flightapi.service;

import com.example.flightapi.controller.dto.FlightRequestDto;
import com.example.flightapi.controller.dto.FlightResponseDto;

import java.util.List;

public interface FlightService {
  List<FlightResponseDto> getAllFlights() throws Exception;  
  List<FlightResponseDto> searchFlights(FlightRequestDto flightRequestDto) throws Exception;
}
