package com.example.ch07.bookmanager.repository;


import com.example.ch06.bookmanager.doamin.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface UserRepository extends JpaRepository<User, Long> {
    Set<User> findByName(String email);

    User findUserByNameIs(String name);

    User findUserByName(String name);

    User findUserByNameEquals(String name);
//    리턴타입을 User 말고도 List<User>, Optional<User>, Set<User> 모두 가능 더 많은 가지수가 존재

    User findByEmail(String email);

    User getByEmail(String email);

    User readByEmail(String email);

    User queryByEmail(String email);

    User searchByEmail(String email);

    User streamByEmail(String email);

    User findUserByEmail(String email);

    List<User> findFirst1ByName(String name);

    List<User> findTop2ByName(String name);

    List<User> findByEmailAndName(String email, String name);

    List<User> findByEmailOrName(String email, String name);

//------------------------------------------------------------------------------------------------

    List<User> findBycreatedAtAfter(LocalDateTime yesterday);

    List<User> findByIdAfter(Long id);

    List<User> findBycreatedAtGreaterThan(LocalDateTime yesterday);

    List<User> findBycreatedAtGreaterThanEqual(LocalDateTime yesterday);

    List<User> findBycreatedAtLessThan(LocalDateTime yesterday);

    List<User> findBycreatedAtLessThanEqual(LocalDateTime yesterday);

    List<User> findBycreatedAtBetween(LocalDateTime yesterday, LocalDateTime tomorrow);

    List<User> findByIdBetween(Long id1, Long id2);

//------------------------------------------------------------------------------------------------

    List<User> findByIdIsNotNull();

//    List<User> findByAddressIsNotEmpty();

    List<User> findByNameIn(List<String> names);

    List<User> findByNameStartingWith(String name);

    List<User> findByNameEndingWith(String name);

    List<User> findByNameContains(String name);

    List<User> findByNameLike(String name);


//------------------------------------------------------------------------------------------------

    List<User> findTop1ByName(String name);

    List<User> findLast1ByName(String name); // findByName 으로 동작함 Last1  무시됨

    List<User> findTop1ByNameOrderByIdDesc(String name); // 이렇게 해야 역순은로 찾아옴 Desc 역순 Asc 정순

    List<User> findFirstByNameOrderByIdDescEmailAsc(String name);

    List<User> findFirstByName(String name, Sort sort);
//------------------------------------------------------------------------------------------------

    Page<User> findByName(String name, Pageable pageable);

    @Query(value = "select * from user limit 1;", nativeQuery = true)
    Map<String, Object> findRawRecord();

}
