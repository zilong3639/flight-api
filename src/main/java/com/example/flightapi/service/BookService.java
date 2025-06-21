package com.example.flightapi.service;

import com.example.flightapi.controller.dto.BookRequestDto;
import com.example.flightapi.controller.dto.BookResponseDto;

import java.util.List;

public interface BookService {
  List<BookResponseDto> getAllBooks() throws Exception;  
  List<BookResponseDto> getUserBooks(BookRequestDto bookRequestDto) throws Exception;  
  void insertNew(List<BookRequestDto> bookRequestDtoL) throws Exception;

}
