package com.example.ch08.bookmanager.repository;


import com.example.ch08.bookmanager.doamin.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
