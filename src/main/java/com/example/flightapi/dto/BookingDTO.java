package com.example.flightapi.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class BookingDTO {

    public BookingDTO(Long id, Long userId, Long flightId, String reference, String status, LocalDateTime bookingTime, BigDecimal totalPrice) {
        this.id = id;
        this.userId = userId;
        this.flightId = flightId;
        this.reference = reference;
        this.status = status;
        this.bookingTime = bookingTime;
        this.totalPrice = totalPrice;
    }

    private Long id;

    private Long userId;

    private Long flightId;

    private String reference;

    private String status;

    private LocalDateTime bookingTime;

    private BigDecimal totalPrice;
}
