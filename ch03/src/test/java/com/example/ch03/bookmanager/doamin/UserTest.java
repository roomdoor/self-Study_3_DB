package com.example.ch03.bookmanager.doamin;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;


class UserTest {


    @Test
    void test() {

        User user = new User();
        user.setEmail("sihwa@naver.com");
        user.setName("sihwa");
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());

        User user1 = new User(null, "sihwaLee", "sihwLee@naver.com", LocalDateTime.now(), LocalDateTime.now());
        User user2 = new User("sihwaLee", "sihwLee@naver.com" );

        User user3 = new User().builder()
                .name("SH")
                .email("SH@naver.com")
                .build();

        System.out.println(">>>" + user.toString());
    }
}