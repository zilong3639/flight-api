package com.example.flightapi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // 允许所有路径的跨域请求
                .allowedOrigins("http://localhost:8080") // 允许来自http://localhost:3000的请求
                .allowedMethods(new String[]{"GET", "POST", "PUT", "DELETE"}) // 允许的请求方法
                .allowedHeaders("*"); // 允许的请求头
    }
}
