package com.example.flightapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FlightApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlightApiApplication.class, args);
        System.out.println("航空订票平台API服务启动成功！");
    }
}