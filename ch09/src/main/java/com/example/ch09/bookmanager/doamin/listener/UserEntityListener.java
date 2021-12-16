package com.example.ch09.bookmanager.doamin.listener;

import com.example.ch09.bookmanager.doamin.User;
import com.example.ch09.bookmanager.doamin.UserHistory;
import com.example.ch09.bookmanager.repository.UserHistoryRepository;
import com.example.ch09.bookmanager.suporter.BeanUtils;

import javax.persistence.PostPersist;
import javax.persistence.PostUpdate;

public class UserEntityListener {

    @PostPersist
    @PostUpdate
    public void prePersistAndPreUpdate(Object o) {

        UserHistoryRepository userHistoryRepository = BeanUtils.getBean(UserHistoryRepository.class);


        User user = (User) o;

        UserHistory userHistory = new UserHistory();
//        userHistory.setUserId(user.getId());
        userHistory.setName(user.getName());
        userHistory.setEmail(user.getEmail());
        userHistory.setUser(user);

        userHistoryRepository.save(userHistory);


    }
}
