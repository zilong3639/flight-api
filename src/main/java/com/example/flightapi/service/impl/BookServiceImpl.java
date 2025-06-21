package com.example.flightapi.service.impl;

import com.example.flightapi.controller.dto.BookRequestDto;
import com.example.flightapi.controller.dto.BookResponseDto;
import com.example.flightapi.entity.BookEntity;
import com.example.flightapi.repository.BookRepository;
import com.example.flightapi.service.BookService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Service
public class BookServiceImpl implements BookService {
  private final BookRepository bookRepository;

  public BookServiceImpl(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
  }

  public List<BookResponseDto> getAllBooks() throws Exception {
    return getBookDtoList(bookRepository.findAll());
  }

  @Override
  public List<BookResponseDto> getUserBooks(BookRequestDto bookRequestDto) throws Exception{
	  List<Object[]> bookEntityList = bookRepository.getUserBooks(bookRequestDto.getUser_id());
	  List<BookResponseDto> bookList  = new ArrayList<>();
	  for (int i = 0; i < bookEntityList.size(); i++) {
		  BookEntity bookEntity = (BookEntity)bookEntityList.get(i)[0];
		  BookResponseDto bookResponseDto = new BookResponseDto();
	        BeanUtils.copyProperties(bookEntity, bookResponseDto);
	        bookResponseDto.setFlight_number((String)bookEntityList.get(i)[1]);
	        bookResponseDto.setDeparture_time((LocalDateTime)bookEntityList.get(i)[2]);
	        bookResponseDto.setDestination_time((LocalDateTime)bookEntityList.get(i)[3]);
	        bookResponseDto.setDepartureAirportName((String) bookEntityList.get(i)[4]);
	        bookResponseDto.setDestinationAirportName((String) bookEntityList.get(i)[5]);
	        bookList.add(bookResponseDto);
	  }
      return bookList;
  }
  public List<BookResponseDto> getBookDtoList(List<BookEntity> bookEntityList){
	  List<BookResponseDto> flightList  = new ArrayList<>();
	    for (int i = 0; i < bookEntityList.size(); i++) {
	    	BookResponseDto flightResponseDto = new BookResponseDto();
	        BeanUtils.copyProperties(bookEntityList.get(i), flightResponseDto);
	        flightList.add(flightResponseDto);
	    }
	    return flightList;
  }
  
  public void insertNew(List<BookRequestDto> bookRequestDtoL) throws Exception {
	  for (int i = 0; i < bookRequestDtoL.size(); i++) {
		  BookRequestDto bookRequestDto =bookRequestDtoL.get(i);
		  BookEntity bookEntity = new BookEntity();
		  BeanUtils.copyProperties(bookRequestDto, bookEntity);
		  bookEntity.setReference("test");
		  bookEntity.setStatus("0");
		  bookEntity.setBooking_time(LocalDateTime.now());
		  bookRepository.save(bookEntity);
	  }
  	
  };
}
