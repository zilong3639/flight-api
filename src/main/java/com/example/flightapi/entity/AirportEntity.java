package com.example.flightapi.entity;
import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "airport")
public class AirportEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "airport_id")
    private Long airport_id;

    @Column(name = "airport_code", nullable = false, length = 10)
    private String airport_code;

    @Column(name = "airport_name", nullable = false, length = 100)
    private String airport_name;

    @Column(name = "city", nullable = false, length = 100)
    private String city;

}
