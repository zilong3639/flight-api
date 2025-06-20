package com.example.flightapi.repository;

import com.example.flightapi.dto.Flight;
import com.example.flightapi.entity.FlightEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface FlightRepository extends JpaRepository<FlightEntity, Long> {

    @Query(value = "SELECT f.id, f.flight_number as flightNumber, dep.name AS departure, arr.name AS destination, f.departure_date as date, f.departure_time as time, f.price as price " +
            "FROM flight f JOIN airport dep ON f.departure_airport_id = dep.id JOIN airport arr ON f.destination_airport_id = arr.id " +
            "WHERE f.departure_airport_id = :from AND f.destination_airport_id = :to AND f.departure_date = :date ORDER BY f.departure_time", nativeQuery = true)
    List<Flight> findFlightList(@Param("from") String from, @Param("to") String to, @Param("date") String date);

}
