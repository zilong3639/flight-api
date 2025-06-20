package com.example.flightapi.controller;

import com.example.flightapi.dto.AjaxResult;
import com.example.flightapi.dto.BookingRequest;
import com.example.flightapi.service.BookingService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bookings")
@Tag(name = "航班预订")
public class BookingController extends BaseController {

    @Autowired
    BookingService bookingService;

    @GetMapping
    public AjaxResult getBookings(@RequestParam String status) {

        return bookingService.findBookingByUserId(1L, status);
    }

    @GetMapping("/{id}")
    public AjaxResult getBookingDetail(@PathVariable Long id) {
        return bookingService.findBookingById(id);
    }

    @PostMapping
    public AjaxResult createBooking(@RequestBody BookingRequest request) {
        // 实现创建预订逻辑
        return bookingService.createBooking(request);
    }
}
