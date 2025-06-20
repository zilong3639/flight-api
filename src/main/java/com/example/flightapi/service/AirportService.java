package com.example.flightapi.service;

import com.example.flightapi.dto.AirportDTO;
import com.example.flightapi.dto.AjaxResult;
import com.example.flightapi.repository.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AirportService {

    @Autowired
    private AirportRepository airportRepository;

    public AjaxResult findAll() {
        AirportDTO airportDTO = new AirportDTO();
        airportDTO.setAirports(airportRepository.findAll());
        return AjaxResult.success(airportDTO);
    }
}
