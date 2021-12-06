package com.example.ch02.bookmanager.repository;

import com.example.ch02.bookmanager.doamin.User;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.*;


import java.util.List;

import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.contains;
import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.endsWith;

@SpringBootTest
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    void crud() {
//        ------------------------------------------------------------------------------------------------------------
//        ------------------------ Ch02.01 ------------------------
//        ------------------------------------------------------------------------------------------------------------
//        userRepository.save(new User());
//
//        userRepository.findAll().forEach(System.out::println);
//        ------------------------------------------------------------------------------------------------------------
//        List<User> users = userRepository.findAll(Sort.by(Sort.Direction.DESC,"name"));   // 이름의 역순

//        List<User> users = userRepository.findAllById(Lists.newArrayList(1L, 3L, 5L)); // id 가 1, 3, 5 인 값을 가져옴

//        users.forEach(System.out::println);
//        ------------------------------------------------------------------------------------------------------------
//        User user1 = new User("sihwa", "sihwa@naver.com");
//        User user2 = new User("sihwaLee", "sihwaLee@naver.com");
//
//        userRepository.saveAll(Lists.newArrayList(user1, user2));   // 저장 한번에
//
//        List<User> users = userRepository.findAll();
//
//        users.forEach(System.out::println);
//        ------------------------------------------------------------------------------------------------------------
//        User user = userRepository.getOne(1L);  // @Transactional 필요     getOne 은 lazy 한 loading 지원
//        System.out.println(user);
//        ------------------------------------------------------------------------------------------------------------
//        User user = userRepository.findById(1L).orElse(null);  // @Transactional 필요     getOne 은 lazy 한 loading 지원
//        System.out.println(user);

//        ------------------------------------------------------------------------------------------------------------
//        ------------------------ Ch02.02-2 ------------------------------------------------------------------------------
//        ------------------------------------------------------------------------------------------------------------
//
//        userRepository.save(new User("sihwa", "sihwa95@naver.com"));    // save flush 따로 안쓰고 saveAndFlush  쓰면 한번에 가능
//        userRepository.flush();                                                     // flush 는 query 에 영향 x DB 반영 시점을 결정하는것 (로그상에 변화 없음)
//        userRepository.findAll().forEach(System.out::println);
//        ------------------------------------------------------------------------------------------------------------
//        long count = userRepository.count(); // 저장된 갯수 확인
//        System.out.println(count);
//        ------------------------------------------------------------------------------------------------------------
//        boolean exists = userRepository.existsById(1L); // 1번 아이디에 자료가 있는지 확인
//        System.out.println(exists);
//        ------------------------------------------------------------------------------------------------------------
//        userRepository.delete(userRepository.findById(1L).orElseThrow(RuntimeException::new));
//        userRepository.deleteById(1L);
//        ------------------------------------------------------------------------------------------------------------
//        userRepository.deleteAll(userRepository.findAllById(Lists.newArrayList(1L, 3L)));         // 1, 3 찾아서 지우는데  for 문 계속 돌려서 찾음 (갯수 많아지면 오래걸림)
//        userRepository.findAll().forEach(System.out::println);
//        ------------------------------------------------------------------------------------------------------------
//        userRepository.deleteAllInBatch(userRepository.findAllById(Lists.newArrayList(1L, 3L)));    // delete 를 한번만 수행하고 제거 가능
//        userRepository.findAll().forEach(System.out::println);
//        ------------------------------------------------------------------------------------------------------------
//        userRepository.deleteAllInBatch();    // delete 를 한번만 수행하고 제거 가능 select 도 필요 없음
//        userRepository.findAll().forEach(System.out::println);
//        ------------------------------------------------------------------------------------------------------------
//        Page<User> users = userRepository.findAll(PageRequest.of(0, 3));    // 한 페이지에 3개씩 담고 0번째 페이지 불러오겠다
//
//        System.out.println("page : " + users);                                  // 페이지 이름 , 2페이지 중 첫번째 패이지 라고 나옴
//        System.out.println("totalElement : " + users.getTotalElements());       // 5개 저장된거 갯수 (getCount)
//        System.out.println("totalPage : " + users.getTotalPages());             // Element / size  페이지 갯수 나옴
//        System.out.println("numberOrElements : " + users.getNumberOfElements());// 현재 페이지에 몇개의 Elements 있는지
//        System.out.println("sort : " + users.getSort());                        // 정렬
//        System.out.println("size : " + users.getSize());                        // 페이지 사이즈 3개라고 정의 한것 불러옴
//
//        users.getContent().forEach(System.out::println);
//        ------------------------------------------------------------------------------------------------------------
// QBE(Query By Example) : entity 를 example 로 만들고 렛쳐를 추가해서 선언해주므로서 필요한 query 를 만드는것 ???????
//        ExampleMatcher matcher = ExampleMatcher.matching()          // 검색을 위한 변수 처리 (name 은 제외하고 email 에서 끝에서 (endsWith)
//                .withIgnorePaths("name")
//                .withMatcher("email", endsWith());
//
//        Example<User> example = Example.of(new User("Lee", "fastcampus.com"), matcher); // new User 는 가짜 entity
//
//        userRepository.findAll(example).forEach(System.out::println);
//        ------------------------------------------------------------------------------------------------------------
//       QBE 다른 방법
//        User user = new User();
//        user.setEmail("slow");
//
//        ExampleMatcher Matcher = ExampleMatcher.matching().withMatcher("email", contains()); // email 을 양방향에서 검색
//        Example<User> example = Example.of(user, Matcher);
//
//        userRepository.findAll(example).forEach(System.out::println);

//        ------------------------------------------------------------------------------------------------------------
//        ------------------------ Ch02.03 ------------------------------------------------------------------------------
//        ------------------------------------------------------------------------------------------------------------
//
//        userRepository.save(new User("david", "david@fastcampuus.com"));
//        User user = userRepository.findById(1L).orElseThrow(RuntimeException::new);
//        user.setEmail("martin-update@fastcampus.com");
//
//        userRepository.save(user);
    }
}