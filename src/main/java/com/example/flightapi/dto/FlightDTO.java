package com.example.flightapi.dto;

import lombok.Data;

import java.util.List;

@Data
public class FlightDTO {
    private List<Flight> flightList;
}
