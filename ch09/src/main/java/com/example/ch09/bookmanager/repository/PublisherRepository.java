package com.example.ch09.bookmanager.repository;

import com.example.ch09.bookmanager.doamin.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
