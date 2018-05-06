package com.greenfoxacademy.library.repositories;

import com.greenfoxacademy.library.models.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {

}
