package com.example.ch05.bookmanager.doamin;


import com.example.ch05.bookmanager.doamin.listener.Auditable;
import com.example.ch05.bookmanager.doamin.listener.UserEntityListener;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)    // BaseEntity 사용해서 모든 entity 에 createdAt, updatedAt 자동으로 넣으려면 필요
@ToString(callSuper = true)             // BaseEntity 사용해서 모든 entity 에 createdAt, updatedAt 자동으로 넣으려면 필요
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Builder
@Entity
@EntityListeners(value = {UserEntityListener.class})
public class User extends BaseEntity implements Auditable {
    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String name;

    @NonNull
    private String email;

//    @CreatedDate
//    private LocalDateTime createdAt;
//
//    @LastModifiedDate
//    private LocalDateTime updatedAt;

    @Enumerated(value = EnumType.STRING)     // 타입 지정 하지 않으면 enum 에 작성된 순서대로 0, 1, 2, 3 ...
    private Gender gender;


//    @PrePersist     // insert 호출 되기 전에
//    @PreUpdate      // 머지 메소드 호출 전
//    @PreRemove      // delete 메소드 호출 전
//    @PostPersist    // persist 매서드 실행 후에
//    @PostUpdate     // 머지 메소드 호출 후
//    @PostRemove     // delete 메소드 실행 후
//    @PostLoad       // select 조회 실행 후

//    @PrePersist
//    public void prePersist() {
//        this.createdAt = LocalDateTime.now();
//        this.updatedAt = LocalDateTime.now();
//    }

    //    @PostPersist
//    public void postPersist() {
//
//        System.out.println(">>>>> postPersist");
//    }
//
//    @PreUpdate
//    public void preUpdate() {
//        this.updatedAt = LocalDateTime.now();
//    }
//
//    @PostUpdate
//    public void postUpdate() {
//        System.out.println(">>>>> postUpdate");
//    }
//
//    @PreRemove
//    public void PreRemove() {
//        System.out.println(">>>>> PreRemove");
//    }
//
//    @PostRemove
//    public void PostRemove() {
//        System.out.println(">>>>> PostRemove");
//    }
//
//    @PostLoad
//    public void PostLoad() {
//        System.out.println(">>>>> PostLoad");
//    }


}
