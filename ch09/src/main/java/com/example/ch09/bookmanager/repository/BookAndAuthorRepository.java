package com.example.ch09.bookmanager.repository;

import com.example.ch09.bookmanager.doamin.BookAndAuthor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookAndAuthorRepository extends JpaRepository<BookAndAuthor, Long> {
}
