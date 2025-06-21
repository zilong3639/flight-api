package com.example.flightapi.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "booking")
public class BookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_id")
    private Long booking_id;
 
    @Column(name = "user_id", nullable = false)
    private Long user_id;
 
    @Column(name = "flight_id", nullable = false)
    private Long flight_id;
 
    @Column(name = "reference", nullable = false, length = 20)
    private String reference;
 
    @Column(name = "status", nullable = false, length = 20)
    private String status;
 
    @Column(name = "total_price", nullable = false, precision = 15, scale = 2)
    private BigDecimal total_price;
 
    @Column(name = "contact_phone", nullable = false, length = 20)
    private String contact_phone;
 
    @Column(name = "booking_time", nullable = false, updatable = false)
    private LocalDateTime booking_time;
 
}