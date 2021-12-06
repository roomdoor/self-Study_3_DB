package com.example.ch05.bookmanager.doamin;


import com.example.ch05.bookmanager.doamin.listener.Auditable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;


@EqualsAndHashCode(callSuper = true)    // BaseEntity 사용해서 모든 entity 에 createdAt, updatedAt 자동으로 넣으려면 필요
@ToString(callSuper = true)             // BaseEntity 사용해서 모든 entity 에 createdAt, updatedAt 자동으로 넣으려면 필요
@Data
@NoArgsConstructor
@Entity
//@EntityListeners(value = AuditingEntityListener.class)
public class UserHistory extends BaseEntity implements Auditable {

    @Id
    @GeneratedValue
    private Long Id;

    private String name;

    private String email;

//    @CreatedDate
//    private LocalDateTime createdAt;
//
//    @LastModifiedDate
//    private LocalDateTime updatedAt;

}
