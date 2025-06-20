package com.example.flightapi.controller;

import com.example.flightapi.dto.AjaxResult;
import com.example.flightapi.service.AirportService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/airport")
@Tag(name = "机场信息")
public class AirportController {

    @Autowired
    private AirportService airportService;

    @GetMapping
    public AjaxResult getAllAirports() {
        // 实现航班查询逻辑
        return airportService.findAll();
    }
}
