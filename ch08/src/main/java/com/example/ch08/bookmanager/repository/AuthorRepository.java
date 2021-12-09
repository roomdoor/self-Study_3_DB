package com.example.ch08.bookmanager.repository;

import com.example.ch08.bookmanager.doamin.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
