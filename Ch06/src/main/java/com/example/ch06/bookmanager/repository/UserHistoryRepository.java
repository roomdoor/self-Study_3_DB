package com.example.ch06.bookmanager.repository;

import com.example.ch06.bookmanager.doamin.User;
import com.example.ch06.bookmanager.doamin.UserHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserHistoryRepository extends JpaRepository<UserHistory, Long> {

    List<UserHistory> findByUserId(Long userId);
}
