package com.example.flightapi.service.impl;

import com.example.flightapi.controller.dto.FlightRequestDto;
import com.example.flightapi.controller.dto.FlightResponseDto;
import com.example.flightapi.entity.FlightEntity;
import com.example.flightapi.repository.FlightRepository;
import com.example.flightapi.service.FlightService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class FlightServiceImpl implements FlightService {
  private final FlightRepository flightRepository;

  public FlightServiceImpl(FlightRepository flightRepository) {
    this.flightRepository = flightRepository;
  }

  public List<FlightResponseDto> getAllFlights() throws Exception {
    return getFlightsDtoList(flightRepository.findAll());
  }

  @Override
  public List<FlightResponseDto> searchFlights(FlightRequestDto flightRequestDto) throws Exception{
	  List<Object[]> flightEntityList = flightRepository.searchFlights(flightRequestDto.getDepartureAirportCode(),
	    		flightRequestDto.getDestinationAirportCode(), flightRequestDto.getDate());
	  List<FlightResponseDto> flightList  = new ArrayList<>();
	  for (int i = 0; i < flightEntityList.size(); i++) {
		  FlightEntity flightEntity = (FlightEntity)flightEntityList.get(i)[0];
	    	FlightResponseDto flightResponseDto = new FlightResponseDto();
	        BeanUtils.copyProperties(flightEntity, flightResponseDto);
	        flightResponseDto.setDepartureAirportName((String)flightEntityList.get(i)[1]);
	        flightResponseDto.setDestinationAirportName((String) flightEntityList.get(i)[2]);
	        flightList.add(flightResponseDto);
	  }
      return flightList;
  }
  public List<FlightResponseDto> getFlightsDtoList(List<FlightEntity> flightEntityList){
	  List<FlightResponseDto> flightList  = new ArrayList<>();
	    for (int i = 0; i < flightEntityList.size(); i++) {
	    	FlightResponseDto flightResponseDto = new FlightResponseDto();
	        BeanUtils.copyProperties(flightEntityList.get(i), flightResponseDto);
	        flightList.add(flightResponseDto);
	    }
	    return flightList;
  }
}
