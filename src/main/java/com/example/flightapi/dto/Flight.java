package com.example.flightapi.dto;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;

@Data
public class Flight {

    public Flight(Long id, String flightNumber, String departure, String destination, Date date, Time time, BigDecimal price) {
        this.id = id;
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.destination = destination;
        this.date = date;
        this.time = time;
        this.price = price;
    }

    @Id
    private Long id;

    private String flightNumber;

    private String departure;

    private String destination;

    private Date date;

    private Time time;

    private BigDecimal price;
}