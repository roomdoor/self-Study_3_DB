package com.example.ch08.bookmanager.bookmanager.service;

import com.example.ch08.bookmanager.repository.UserRepository;
import com.example.ch08.bookmanager.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserServiceTest {

    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;

    @Test
    void test() {
        userService.put();

        userRepository.findAll().forEach(System.out::println);
    }
}