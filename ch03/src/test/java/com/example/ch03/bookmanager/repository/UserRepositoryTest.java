package com.example.ch03.bookmanager.repository;

import com.example.ch03.bookmanager.doamin.User;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    void select() {

//------------------------------------------------------------------------------------------------------------
//------------------------------------------------Ch03.01-----------------------------------------------------
//------------------------------------------------------------------------------------------------------------
//        System.out.println("findBy : " + userRepository.findByEmail("sophia@slowcampus.com"));
//        System.out.println("getBy : " + userRepository.getByEmail("sophia@slowcampus.com"));
//        System.out.println("queryBy : " + userRepository.queryByEmail("sophia@slowcampus.com"));
//        System.out.println("searchBy : " + userRepository.searchByEmail("sophia@slowcampus.com"));
//        System.out.println("findUserBy : " + userRepository.findUserByEmail("sophia@slowcampus.com"));
//        System.out.println("readBy : " + userRepository.readByEmail("sophia@slowcampus.com"));
//        System.out.println("streamBy : " + userRepository.streamByEmail("sophia@slowcampus.com"));
//------------------------------------------------------------------------------------------------------------
//        System.out.println("findFirst1By : " + userRepository.findFirst1ByName("martin"));
//        System.out.println("findTpo1By : " + userRepository.findTop2ByName("martin"));

//------------------------------------------------------------------------------------------------------------
//------------------------------------------------Ch03.02-----------------------------------------------------
//------------------------------------------------------------------------------------------------------------
//        System.out.println("findByEmailAndName : "+userRepository.findByEmailAndName("sophia@slowcampus.com","sophia"));
//        System.out.println("findByEmailOrName : " + userRepository.findByEmailOrName("sophia@slowcampus.com", "martin"));

//        System.out.println("findByCreatAtAfter : " + userRepository.findByCreatedAtAfter(LocalDateTime.now().minusDays(1L)));
//        System.out.println("findByIdAfter : " + userRepository.findByIdAfter(4L));
//
//        System.out.println("findByCreatAtGreaterThan : " + userRepository.findByCreatedAtGreaterThan(LocalDateTime.now().minusDays(1L)));
//        System.out.println("findByCreatAtGreaterThanEqual : " + userRepository.findByCreatedAtGreaterThanEqual(LocalDateTime.now().minusDays(1L)));
//        System.out.println("findByCreatAtLessThan : " + userRepository.findByCreatedAtLessThan(LocalDateTime.now().plusDays(1L)));
//        System.out.println("findByCreatAtLessThanEqual : " + userRepository.findByCreatedAtLessThanEqual(LocalDateTime.now().plusDays(1L)));
//        System.out.println("findByCreatAtBetween : " + userRepository.findByCreatedAtBetween(LocalDateTime.now().minusDays(1L), LocalDateTime.now()));
//        System.out.println("findByIdBetween : " + userRepository.findByIdBetween(1L, 3L));

//------------------------------------------------------------------------------------------------------------
//------------------------------------------------Ch03.03-----------------------------------------------------
//------------------------------------------------------------------------------------------------------------

//        System.out.println("findByIdIsNotNull : " + userRepository.findByIdIsNotNull());
//
//        System.out.println("findByIdIsNotEmpty : " + userRepository.findByAddressIsNotEmpty());
//
//        System.out.println("findByNameIn : " + userRepository.findByNameIn(Lists.newArrayList("martin", "dennis")));
//
//        System.out.println("findByNameStartingWith : " + userRepository.findByNameStartingWith("mar"));
//        System.out.println("findByNameEndingWith : " + userRepository.findByNameEndingWith("tin"));
//        System.out.println("findByNameContains : " + userRepository.findByNameContains("ti"));
//
//        System.out.println("Like 를 StartingWith 로  쓰는 법" + userRepository.findByNameLike("mar%"));
//        System.out.println("Like 를 EndingWith 로  쓰는 법" + userRepository.findByNameLike("%tin"));
//        System.out.println("Like 를 Contains 로  쓰는 법" + userRepository.findByNameLike("%ti%"));
    }



//------------------------------------------------------------------------------------------------------------
//------------------------------------------------Ch03.04-----------------------------------------------------
//------------------------------------------------------------------------------------------------------------
    @Test
    void pageAndSortingTest() {

        System.out.println("findTop1ByName : " + userRepository.findTop1ByName("martin"));
        System.out.println("findLast1ByName : " + userRepository.findLast1ByName("martin"));
        System.out.println("findTop1ByNameOrderByIdDesc : " + userRepository.findTop1ByNameOrderByIdDesc("martin"));
        System.out.println("findFirstByNameOrderByIdDescEmailAsc : " + userRepository.findFirstByNameOrderByIdDescEmailAsc("martin"));
        System.out.println("findFirstByNameWithSorting : " + userRepository.findFirstByName("martin", Sort.by(Sort.Order.desc("id"), Sort.Order.asc("email"))));
        System.out.println("findByNameWithPageable : " + userRepository.findByName("martin", PageRequest.of(1,1,Sort.by(Sort.Order.desc("Id")))));

    }




















}