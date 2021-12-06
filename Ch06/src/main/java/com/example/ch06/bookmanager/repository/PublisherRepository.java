package com.example.ch06.bookmanager.repository;

import com.example.ch06.bookmanager.doamin.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
