package com.example.ch09.bookmanager.bookmanager.service;

import com.example.ch09.bookmanager.doamin.User;
import com.example.ch09.bookmanager.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;


@SpringBootTest
public class EntityManagerTest {

    @Autowired
    private EntityManager entityManager;
    @Autowired
    private UserRepository userRepository;

    @Test
    void entityManagerTest() {
        System.out.println(entityManager.createQuery("select u from User u").getResultList());
    }

    @Test
    @Transactional
    void chashDIndTest() {
        System.out.println(userRepository.findByEmail("martin@fastcampus.com"));
        System.out.println(userRepository.findByEmail("martin@fastcampus.com"));
        System.out.println(userRepository.findByEmail("martin@fastcampus.com"));

        System.out.println(userRepository.findById(2L).get());
        System.out.println(userRepository.findById(2L).get());
        System.out.println(userRepository.findById(2L).get());

        userRepository.deleteById(1L);
    }

    @Test
    @Transactional
    void chashFindTest2() {
        User user = userRepository.findById(1L).get();
        user.setName("marrrrrrtin");
        userRepository.save(user);

        user.setEmail("marrrrrtin@fastcampus.com");
        userRepository.save(user);

        System.out.println(">>>> 1 : " + userRepository.findById(1L).get());

        System.out.println(">>>> 2 : " + userRepository.findById(1L).get());

        System.out.println(userRepository.findAll());

    }
}
