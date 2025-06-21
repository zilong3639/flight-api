package com.example.flightapi.controller;

import com.example.flightapi.controller.dto.FlightRequestDto;
import com.example.flightapi.controller.dto.FlightResponseDto;
import com.example.flightapi.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {
    @Autowired
    private FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }
    @GetMapping
    public ResponseEntity<List<FlightResponseDto>> getAllFlights() throws Exception{
        return ResponseEntity.ok(flightService.getAllFlights());
    }

    @GetMapping("/flightSelect")
    public ResponseEntity<List<FlightResponseDto>> searchFlights(
            @RequestParam(name = "departureCode", required = true) String departure,
            @RequestParam(name = "destinationCode", required = true) String arrival,
            @RequestParam(name = "date", required = true) LocalDate date) throws Exception{
    	FlightRequestDto flightRequestDto = new FlightRequestDto();
    	flightRequestDto.setDepartureAirportCode(departure);
    	flightRequestDto.setDestinationAirportCode(arrival);
    	flightRequestDto.setDate(date);
        return ResponseEntity.ok(flightService.searchFlights(flightRequestDto));
    }
    
}
