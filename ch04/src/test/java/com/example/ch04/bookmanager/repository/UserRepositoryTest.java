package com.example.ch04.bookmanager.repository;

import com.example.ch04.bookmanager.doamin.Gender;
import com.example.ch04.bookmanager.doamin.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;

    @Test
    void insertAndUpdateTest() {

        User user = new User();
        user.setName("martin");
        user.setEmail("martin@fastcampus.com");
        // insert
        userRepository.save(user);


        User user2 = userRepository.findById(1L).orElseThrow(RuntimeException::new);
        user2.setName("Marrrtin");
//        // update
        userRepository.save(user2);
    }

    @Test
    void enumTest() {
        User user = userRepository.findById(1L).orElseThrow(RuntimeException::new);
        user.setGender(Gender.MALE);

        userRepository.save(user);

        userRepository.findAll().forEach(System.out::println);

        System.out.println(userRepository.findRawRecord().get("Gender"));
    }
}