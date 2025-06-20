package com.example.flightapi.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;


public class FlightDetailDTO extends Flight {

    public FlightDetailDTO(Long id, String flightNumber, String departure, String destination, Date date, Time time, BigDecimal price) {
        super(id, flightNumber, departure, destination, date, time, price);
    }
}