package com.example.demoRestApi.services;

import com.example.demoRestApi.domain.Book;

import java.util.List;

public interface BookService {
    Book saveBook(Book book);
    List<Book> getAllBook();
}
