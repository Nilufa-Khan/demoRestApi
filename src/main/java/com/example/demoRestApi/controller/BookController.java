package com.example.demoRestApi.controller;

import com.example.demoRestApi.domain.Book;
import com.example.demoRestApi.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookdata/v1")
public class BookController {
    private BookService bookService;
    @Autowired
    public BookController(BookService bookService){
        this.bookService = bookService;
    }
    @PostMapping("/book")
    public ResponseEntity<?> saveBook(@RequestBody Book book){
        Book book1 = bookService.saveBook(book);
        return new ResponseEntity<>(book1, HttpStatus.CREATED);
    }
    @GetMapping("/books")
    public ResponseEntity<?> getAllBook(){
        List list = bookService.getAllBook();
        return new ResponseEntity<>(list,HttpStatus.OK);
    }
}
