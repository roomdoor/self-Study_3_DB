package com.example.ch06.bookmanager.repository;

import com.example.ch06.bookmanager.doamin.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
