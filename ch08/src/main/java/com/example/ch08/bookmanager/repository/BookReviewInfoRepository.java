package com.example.ch08.bookmanager.repository;

import com.example.ch08.bookmanager.doamin.BookReviewInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookReviewInfoRepository extends JpaRepository<BookReviewInfo, Long> {
}
