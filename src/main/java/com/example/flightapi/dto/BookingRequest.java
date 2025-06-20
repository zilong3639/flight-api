package com.example.flightapi.dto;

import com.example.flightapi.entity.PassengerEntity;
import lombok.Data;

@Data
public class BookingRequest {
    private Long flightId;
    private PassengerEntity[] passengerInfo;

}
