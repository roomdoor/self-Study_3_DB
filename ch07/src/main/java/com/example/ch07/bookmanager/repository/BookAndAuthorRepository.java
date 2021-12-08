package com.example.ch07.bookmanager.repository;

import com.example.ch07.bookmanager.doamin.BookAndAuthor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookAndAuthorRepository extends JpaRepository<BookAndAuthor, Long> {
}
