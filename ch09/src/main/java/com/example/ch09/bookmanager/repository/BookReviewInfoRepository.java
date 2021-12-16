package com.example.ch09.bookmanager.repository;

import com.example.ch09.bookmanager.doamin.BookReviewInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookReviewInfoRepository extends JpaRepository<BookReviewInfo, Long> {
}
