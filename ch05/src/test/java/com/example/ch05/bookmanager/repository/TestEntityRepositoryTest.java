package com.example.ch05.bookmanager.repository;

import com.example.ch05.bookmanager.doamin.TestEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TestEntityRepositoryTest {

    @Autowired
    private TestEntityRepository testEntityRepository;

    @Test
    public void listenerAuditableTest() {

        TestEntity testEntity = new TestEntity();
        testEntity.setName("test");

        testEntityRepository.save(testEntity);

        System.out.println("------------------------------------------------------------");
        System.out.println(testEntity);
        System.out.println("-----------------------------------------------------------");
    }
}