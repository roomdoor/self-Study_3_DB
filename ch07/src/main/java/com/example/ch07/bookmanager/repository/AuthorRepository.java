package com.example.ch07.bookmanager.repository;

import com.example.ch07.bookmanager.doamin.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
