package com.example.ch04.bookmanager.doamin;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Builder
@Entity
@Table(name = "user", indexes = {@Index(columnList = "name")}, uniqueConstraints = {@UniqueConstraint(columnNames = {"email"})})
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String name;

    @NonNull
    private String email;

    @Column(updatable = false)  // update 할 떄 이  Column 을 저장하지 않음
    private LocalDateTime createdAt;

//    @Column(insertable = false)  // insert 할 떄 이  Column 을 저장하지 않음
    private LocalDateTime updatedAt;

//    @Transient          // DB 에 반영시기고 싶이 안을떄 사용
//    private String testData;

    @Enumerated(value = EnumType.STRING)     // 타입 지정 하지 않으면 enum 에 작성된 순서대로 0, 1, 2, 3 ...
    private Gender gender;


//    @OneToMany(fetch = FetchType.EAGER)
//    private List<Address> address;
}
