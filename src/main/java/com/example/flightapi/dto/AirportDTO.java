package com.example.flightapi.dto;

import com.example.flightapi.entity.AirportEntity;
import lombok.Data;

import java.util.List;

@Data
public class AirportDTO {
    private List<AirportEntity> airports;
}
