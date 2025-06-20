package com.example.flightapi.repository;

import com.example.flightapi.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<UserEntity, Long> {

    boolean existsByEmail(String email);

    UserEntity findByEmailAndPassword(String email, String password);
}
