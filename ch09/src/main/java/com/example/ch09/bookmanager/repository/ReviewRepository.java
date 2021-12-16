package com.example.ch09.bookmanager.repository;

import com.example.ch09.bookmanager.doamin.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
