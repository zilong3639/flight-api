package com.example.flightapi.service;

import com.example.flightapi.dto.AjaxResult;
import com.example.flightapi.dto.Flight;
import com.example.flightapi.dto.FlightDTO;
import com.example.flightapi.dto.RegisterDTO;
import com.example.flightapi.entity.FlightEntity;
import com.example.flightapi.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Service
public class FlightService {

    @Autowired
    private FlightRepository flightRepository;

    public AjaxResult findFlightList(String from,String to,String date) {
        FlightDTO flightDTO = new FlightDTO();
        List<Flight> flightList = flightRepository.findFlightList(from,to,date);
        flightDTO.setFlightList(flightList);
        return AjaxResult.success(flightDTO);
    }

    public AjaxResult findFlightById(Long id) {
        Optional<FlightEntity> flight = flightRepository.findById(id);
        return AjaxResult.success(flight);
    }
}
