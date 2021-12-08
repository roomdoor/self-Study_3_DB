package com.example.ch07.bookmanager.service;

import com.example.ch07.bookmanager.doamin.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Service
public class UserService {


    @Autowired
    private EntityManager entityManager;

    @Transactional
    public void put() {
        User user = new User();
        user.setName("newUser");
        user.setEmail("newUser@fastcampus.com");

        entityManager.persist(user);
//        entityManager.detach(user);

        user.setName("newUserAfterPersist");
        entityManager.merge(user);

//        entityManager.flush();
//        entityManager.clear();

//        entityManager.remove(user);
    }
}

