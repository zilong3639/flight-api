package com.example.flightapi.repository;


import com.example.flightapi.entity.AirportEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AirportRepository extends JpaRepository<AirportEntity, Long> {
    List<AirportEntity> findAll();
    List<AirportEntity> findByCity(String city);
}
