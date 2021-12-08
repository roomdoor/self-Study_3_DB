package com.example.ch07.bookmanager.bookmanager.repository;

import com.example.ch07.bookmanager.doamin.Gender;
import com.example.ch07.bookmanager.doamin.User;
import com.example.ch07.bookmanager.doamin.UserHistory;
import com.example.ch07.bookmanager.repository.UserHistoryRepository;
import com.example.ch07.bookmanager.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
@Transactional
class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;
    @Autowired
    UserHistoryRepository userHistoryRepository;


    @Test
    void listenerTest() {

        User user = new User();
        user.setEmail("martin2@fastcampus.com");
        user.setName("martin");

        userRepository.save(user);

        User user2 = userRepository.findById(1L).orElseThrow(RuntimeException::new);
        user2.setName("martin2");

        userRepository.save(user2);

        userRepository.deleteById(4L);

        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());
    }

    @Test
    void prePersistTest() { // createdAt 이나 updateAt 등을 매번  user.setCreatedAt(LocalDateTime.now());  user.setUpdatedAt(LocalDateTime.now()); 하기 힘들고 오류 날 수 있음 그래서
                            // prePersist 등 에 넣어 둠으로서 반복 x 정확성 상승

        User user = new User();

        user.setEmail("sdlkfjlsdf@sdkfjlsdf");
        user.setName("sldkfjla");
//        user.setCreatedAt(LocalDateTime.now());   //prePersist 에 지정하면 이 문구를 계속 쓸 필요 없어짐
//        user.setUpdatedAt(LocalDateTime.now());
        userRepository.save(user);
    }

    @Test
    void preUpdate() {

        User user = userRepository.findById(1L).orElseThrow(RuntimeException::new);
        System.out.println("as-si : " + user);

        user.setName("aaaaaaaaaaa");
        user.setEmail("aaaaaaaaa@aaaaaaaa.com");
        userRepository.save(user);

        System.out.println("to-be : " + userRepository.findAll().get(0));
    }

    @Test
    void userHistoryTest() {

        User user = new User();
        user.setEmail("aaaaaaa@aaaaaaaaa.com");
        user.setName("aaaaaaa");
        userRepository.save(user);

        user.setName("bbbbbbb");
        userRepository.save(user);

        userHistoryRepository.findAll().forEach(System.out::println);
    }

    @Test
    void userRelationTest() {
        User user = new User();
        user.setName("sihwa");
        user.setEmail("sihwa95@naver.com");
        user.setGender(Gender.MALE);
        userRepository.save(user);

        user.setName("LeeSiHwa");
        userRepository.save(user);

        user.setEmail("sihwa95@naver.com");
        userRepository.save(user);

        userHistoryRepository.findAll().forEach(System.out::println);

//        List<UserHistory> result = userHistoryRepository
//                .findByUserId(
//                        userRepository
//                                .findByEmail("sihwa95@naver.com")
//                                .getId()
//                );

        List<UserHistory> result = userRepository.findByEmail("sihwa95@naver.com").getUserHistories();

        result.forEach(System.out::println);

        System.out.println("UserHistory.getUser() : " + userHistoryRepository.findAll().get(0).getUser());
    }
}