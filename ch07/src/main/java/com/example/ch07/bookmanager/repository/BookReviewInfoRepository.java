package com.example.ch07.bookmanager.repository;

import com.example.ch06.bookmanager.doamin.BookReviewInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookReviewInfoRepository extends JpaRepository<BookReviewInfo, Long> {
}
