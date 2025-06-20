package com.example.flightapi.repository;

import com.example.flightapi.entity.BookingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<BookingEntity, Long> {

    List<BookingEntity> findByUserIdAndStatus(Long userid, String status);
}
