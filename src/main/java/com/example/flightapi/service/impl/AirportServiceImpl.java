package com.example.flightapi.service.impl;

import com.example.flightapi.controller.dto.AirportResponseDto;
import com.example.flightapi.entity.AirportEntity;
import com.example.flightapi.repository.AirportRepository;
import com.example.flightapi.service.AirportService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AirportServiceImpl implements  AirportService {
  private final AirportRepository airportRepository;
  public AirportServiceImpl(AirportRepository airportRepository) {
    this.airportRepository = airportRepository;
  }
  public List<AirportResponseDto> getAllAirports() throws Exception{
        return getAirportsDtoList(airportRepository.findAll());
  }
  public List<AirportResponseDto> getAirportsByCity(String city) throws Exception{
      return getAirportsDtoList(airportRepository.findByCity(city));
  }
  public List<AirportResponseDto> getAirportsDtoList(List<AirportEntity> airportEntityList){
	  List<AirportResponseDto> airportList  = new ArrayList<>();
	    for (int i = 0; i < airportEntityList.size(); i++) {
	    	AirportResponseDto airportResponseDto = new AirportResponseDto();
	        BeanUtils.copyProperties(airportEntityList.get(i), airportResponseDto);
	        airportList.add(airportResponseDto);
	    }
	    return airportList;
  }
}
