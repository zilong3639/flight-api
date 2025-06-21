package com.example.flightapi.repository;


import com.example.flightapi.entity.FlightEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface FlightRepository extends JpaRepository<FlightEntity, Long> {
   List<FlightEntity> findAll();

   @Query("SELECT f, dep.airport_name as departureName, arr.airport_name as arrivalName " +
          "FROM FlightEntity f " +
          "LEFT JOIN AirportEntity dep ON f.departure_airport_id = dep.airport_code " +
          "LEFT JOIN AirportEntity arr ON f.destination_airport_id = arr.airport_code " +
          "WHERE f.departure_airport_id = :departure " +
          "AND f.destination_airport_id = :arrival " +
          "AND CAST(f.departure_time AS date) = :date")
   List<Object[]> searchFlights(
           @Param("departure") String departure,
           @Param("arrival") String arrival,
           @Param("date") LocalDate date);
}
