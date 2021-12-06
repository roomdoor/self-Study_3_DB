package com.example.ch06.bookmanager.repository;

import com.example.ch06.bookmanager.doamin.BookAndAuthor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookAndAuthorRepository extends JpaRepository<BookAndAuthor, Long> {
}
