package com.example.flightapi.service;

import com.example.flightapi.dto.*;
import com.example.flightapi.entity.BookingEntity;
import com.example.flightapi.entity.FlightEntity;
import com.example.flightapi.repository.BookingRepository;
import com.example.flightapi.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    public AjaxResult findBookingByUserId(Long userId,String status) {
        List<BookingEntity> bookings = bookingRepository.findByUserIdAndStatus(userId,status);
        return AjaxResult.success(bookings);
    }

    public AjaxResult findBookingById(Long id) {
        return AjaxResult.success(bookingRepository.findById(id));
    }

    public AjaxResult createBooking(BookingRequest request) {
        // 插入booking表
        BookingEntity bookingEntity = new BookingEntity();
        bookingEntity.setFlightId(request.getFlightId());
        bookingEntity.setReference("A2332");
        bookingEntity.setStatus("1");
        bookingEntity.setBookingTime(LocalDateTime.now());
        bookingEntity.setTotalPrice(new BigDecimal("9000"));
        // 插入Passenger表
        //TODO
        bookingRepository.save(bookingEntity);
        return AjaxResult.success(bookingEntity);
    }
}
