package com.example.ch07.bookmanager.repository;

import com.example.ch07.bookmanager.doamin.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
