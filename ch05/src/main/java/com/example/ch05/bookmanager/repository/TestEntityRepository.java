package com.example.ch05.bookmanager.repository;


import com.example.ch05.bookmanager.doamin.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestEntityRepository extends JpaRepository<TestEntity, Long> {
}
