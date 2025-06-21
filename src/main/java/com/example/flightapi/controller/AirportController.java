package com.example.flightapi.controller;

import com.example.flightapi.controller.dto.AirportResponseDto;
import com.example.flightapi.service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/airports")
public class AirportController {
    @Autowired
    private AirportService airportService;

    public AirportController(AirportService airportService) {
        this.airportService = airportService;
    }

    @GetMapping
    public ResponseEntity<List<AirportResponseDto>> getAllAirports() throws Exception{
        return ResponseEntity.ok(airportService.getAllAirports());
    }

    @GetMapping("/city/{city}")
    public ResponseEntity<List<AirportResponseDto>> getAirportsByCity(@PathVariable("city") String cityName) throws Exception{
        return ResponseEntity.ok(airportService.getAirportsByCity(cityName));
    }
}
