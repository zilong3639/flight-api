package com.example.flightapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(jsr250Enabled = true)
public class SecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests((authorizationManagerRequestMatcherRegistry) -> {
            authorizationManagerRequestMatcherRegistry.requestMatchers("/v3/api-docs").permitAll();
            authorizationManagerRequestMatcherRegistry.requestMatchers("/v3/api-docs/**").permitAll();
            authorizationManagerRequestMatcherRegistry.requestMatchers("/swagger-ui.html").permitAll();
            authorizationManagerRequestMatcherRegistry.requestMatchers("/swagger-ui/**").permitAll();
            authorizationManagerRequestMatcherRegistry.requestMatchers("/api/auth/*").permitAll();
            authorizationManagerRequestMatcherRegistry.requestMatchers("/api/airport/*").permitAll();
            authorizationManagerRequestMatcherRegistry.requestMatchers("/api/airport").permitAll();
            authorizationManagerRequestMatcherRegistry.requestMatchers("/api/flights/*").permitAll();
            authorizationManagerRequestMatcherRegistry.requestMatchers("/api/flights").permitAll();
            authorizationManagerRequestMatcherRegistry.requestMatchers("/api/bookings/*").permitAll();
            authorizationManagerRequestMatcherRegistry.requestMatchers("/api/bookings").permitAll();
            authorizationManagerRequestMatcherRegistry.anyRequest().authenticated();
        }).csrf(csrf -> csrf.disable());
        return http.build();
    }
}
