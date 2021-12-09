package com.example.ch08.bookmanager.repository;

import com.example.ch08.bookmanager.doamin.BookAndAuthor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookAndAuthorRepository extends JpaRepository<BookAndAuthor, Long> {
}
