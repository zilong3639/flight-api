package com.example.flightapi.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Entity
@Table(name = "flight")
public class FlightEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "flight_number", length = 10)
    private String flightNumber;

    @Column(name = "departure_airport_id")
    private Long departureAirportId;

    @Column(name = "destination_airport_id")
    private Long destinationAirportId;

    @Column(name = "departure_date")
    private LocalDate departureDate;

    @Column(name = "departure_time")
    private LocalTime departureTime;

    @Column(name = "price", precision = 10, scale = 2)
    private BigDecimal price;
}