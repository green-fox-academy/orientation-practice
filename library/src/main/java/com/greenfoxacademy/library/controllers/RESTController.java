package com.greenfoxacademy.library.controllers;

import com.greenfoxacademy.library.models.Book;
import com.greenfoxacademy.library.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class RESTController {

    private final
    BookRepository bookRepository;

    @Autowired
    public RESTController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/books")
    public ArrayList<Book> books() {
        return new ArrayList<Book>(Arrays.asList(
                new Book("22", "qdasdad", "asdasd"),
                new Book("22", "qdasdad", "asdasd"),
                new Book("22", "qdasdad", "asdasd"),
                new Book("22", "qdasdad", "asdasd"),
                new Book("22", "qdasdad", "asdasd"),
                new Book("22", "qdasdad", "asdasd"),
                new Book("22", "qdasdad", "asdasd"),
                new Book("22", "qdasdad", "asdasd")
        ));

    }

}
