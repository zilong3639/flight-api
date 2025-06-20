package com.example.flightapi.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "booking")
public class BookingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "flight_id")
    private Long flightId;

    @Column(name = "reference", length = 20)
    private String reference;

    @Column(name = "status", length = 20)
    private String status;

    @Column(name = "booking_time")
    private LocalDateTime bookingTime;

    @Column(name = "total_price", precision = 15, scale = 2)
    private BigDecimal totalPrice;
}
