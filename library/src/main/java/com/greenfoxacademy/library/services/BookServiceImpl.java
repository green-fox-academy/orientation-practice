package com.greenfoxacademy.library.services;

import com.greenfoxacademy.library.models.Book;
import com.greenfoxacademy.library.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BooksService {
    private final
    BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void addBook(Book book) {
        bookRepository.save(book);
    }

    @Override
    public Book getBookById(Integer id) {
        if (bookRepository.findById(id).isPresent()) {
            return bookRepository.findById(id).get();
        }
        else {
            return null;
        }
    }

    @Override
    public List<Book> getAllBook() {
        return (List<Book>) bookRepository.findAll();
    }
}
