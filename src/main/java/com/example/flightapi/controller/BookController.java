package com.example.flightapi.controller;

import com.example.flightapi.controller.dto.BookRequestDto;
import com.example.flightapi.controller.dto.BookResponseDto;
import com.example.flightapi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    
    public ResponseEntity<List<BookResponseDto>> getAllBooks() throws Exception{
        return ResponseEntity.ok(bookService.getAllBooks());
    }
    @GetMapping("/search")
    public ResponseEntity<List<BookResponseDto>> getUserBooks(
            @RequestParam(name = "userId", required = true) Long userId) throws Exception{
    	BookRequestDto bookRequestDto = new BookRequestDto();
    	bookRequestDto.setUser_id(userId);
        return ResponseEntity.ok(bookService.getUserBooks(bookRequestDto));
    }

    @PostMapping("/insert")
    @Transactional
    public ResponseEntity<String> insertNew(@RequestBody BookRequestDto[] books) {
        try{
        	List<BookRequestDto> bookRequestDtoL = Arrays.asList(books);
        	bookService.insertNew(bookRequestDtoL);
            return ResponseEntity.ok("book insert successfully");
    	}catch(Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
    	}
    }
    
}
