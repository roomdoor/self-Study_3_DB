package com.example.ch02.bookmanager.repository;


import com.example.ch02.bookmanager.doamin.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
}
