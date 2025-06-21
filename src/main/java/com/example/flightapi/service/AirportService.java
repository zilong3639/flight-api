package com.example.flightapi.service;

import com.example.flightapi.controller.dto.AirportResponseDto;

import java.util.List;

public interface AirportService {
  List<AirportResponseDto> getAllAirports() throws Exception;
  List<AirportResponseDto> getAirportsByCity(String city) throws Exception;
}
