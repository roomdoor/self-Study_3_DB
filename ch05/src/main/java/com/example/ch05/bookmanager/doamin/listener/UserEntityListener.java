package com.example.ch05.bookmanager.doamin.listener;

import com.example.ch05.bookmanager.doamin.User;
import com.example.ch05.bookmanager.doamin.UserHistory;
import com.example.ch05.bookmanager.repository.UserHistoryRepository;
import com.example.ch05.bookmanager.suporter.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

public class UserEntityListener {

    @PrePersist
    @PreUpdate
    public void prePersistAndPreUpdate(Object o) {

        UserHistoryRepository userHistoryRepository = BeanUtils.getBean(UserHistoryRepository.class);


        User user = (User) o;

        UserHistory userHistory = new UserHistory();
        userHistory.setId(user.getId());
        userHistory.setName(user.getName());
        userHistory.setEmail(user.getEmail());

        userHistoryRepository.save(userHistory);


    }
}
