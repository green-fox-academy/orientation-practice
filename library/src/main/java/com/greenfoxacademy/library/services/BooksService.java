package com.greenfoxacademy.library.services;

import com.greenfoxacademy.library.models.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BooksService {
    void addBook(Book book);
    Book getBookById(Integer id);
    List<Book> getAllBook();

}
