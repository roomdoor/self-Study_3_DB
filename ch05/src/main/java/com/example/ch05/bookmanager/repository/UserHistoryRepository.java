package com.example.ch05.bookmanager.repository;

import com.example.ch05.bookmanager.doamin.UserHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserHistoryRepository extends JpaRepository<UserHistory, Long> {
}
