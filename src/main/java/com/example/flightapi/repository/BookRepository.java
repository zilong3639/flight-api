package com.example.flightapi.repository;


import com.example.flightapi.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookRepository extends JpaRepository<BookEntity, Long> {
   List<BookEntity> findAll();

   @Query("SELECT b, FF.flight_number,FF.departure_time,FF.destination_time, FF.departureName, FF.arrivalName " +
          "FROM BookEntity b , " +
          "(SELECT f.flight_id as flight_id,f.flight_number as flight_number, "+ 
          "f.departure_time AS departure_time,f.destination_time AS destination_time, "+ 
          "dep.airport_name as departureName, arr.airport_name as arrivalName " +
          "FROM FlightEntity f  " +
          "LEFT JOIN AirportEntity dep ON f.departure_airport_id = dep.airport_code " +
          "LEFT JOIN AirportEntity arr ON f.destination_airport_id = arr.airport_code " +
          ") as FF " +
          "WHERE b.user_id = :userId "+
          "and b.flight_id = FF.flight_id  ")
   List<Object[]> getUserBooks(
           @Param("userId") Long userId);
}
