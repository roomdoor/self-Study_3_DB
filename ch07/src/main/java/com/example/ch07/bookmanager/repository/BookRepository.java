package com.example.ch07.bookmanager.repository;


import com.example.ch07.bookmanager.doamin.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
