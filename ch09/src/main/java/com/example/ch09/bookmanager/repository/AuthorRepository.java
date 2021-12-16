package com.example.ch09.bookmanager.repository;

import com.example.ch09.bookmanager.doamin.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
