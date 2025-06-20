package com.example.flightapi.controller;

import com.example.flightapi.dto.AjaxResult;
import com.example.flightapi.service.FlightService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/flights")
@Tag(name = "航班飞行信息")
public class FlightController {

    @Autowired
    private FlightService flightService;

    @GetMapping
    public AjaxResult getFlightsList(
            @RequestParam String from,
            @RequestParam String to,
            @RequestParam String date) {

        return flightService.findFlightList(from, to, date);
    }

    @GetMapping("/{id}")
    public AjaxResult getFlightDetail(@PathVariable Long id) {
        return flightService.findFlightById(id);
    }
}
