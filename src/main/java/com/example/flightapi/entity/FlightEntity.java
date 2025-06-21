package com.example.flightapi.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "flight")
public class FlightEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "flight_id")
    private Long flight_id;
    
    @Column(name = "flight_number",nullable = false, length = 10)
    private String flight_number;
    
    @Column(name = "departure_airport_id", nullable = false, length = 10)
    private String departure_airport_id;
    
    @Column(name = "destination_airport_id", nullable = false, length = 10)
    private String destination_airport_id;
    
    @Column(name = "departure_time", nullable = false)
    private LocalDateTime departure_time;
    
    @Column(name = "destination_time", nullable = false)
    private LocalDateTime destination_time;
    
    @Column(name = "economy_price", nullable = false)
    private BigDecimal economy_price;
    
    @Column(name = "business_price", nullable = false)
    private BigDecimal business_price;
}
