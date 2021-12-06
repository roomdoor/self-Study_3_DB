package com.example.ch05.bookmanager.repository;


import com.example.ch05.bookmanager.doamin.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
