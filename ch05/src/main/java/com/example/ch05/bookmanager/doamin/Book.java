package com.example.ch05.bookmanager.doamin;

import com.example.ch05.bookmanager.doamin.listener.Auditable;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)    // BaseEntity 사용해서 모든 entity 에 createdAt, updatedAt 자동으로 넣으려면 필요
@ToString(callSuper = true)             // BaseEntity 사용해서 모든 entity 에 createdAt, updatedAt 자동으로 넣으려면 필요
@NoArgsConstructor
@Data
@Entity
//@EntityListeners(value = AuditingEntityListener.class)
public class Book extends BaseEntity implements Auditable {

    @Id
    @GeneratedValue
    private Long Id;

    @NonNull
    private String name;

    @NonNull
    private String author;

//    @CreatedDate
//    private LocalDateTime createdAt;
//
//    @LastModifiedDate
//    private LocalDateTime updatedAt;

//    @PrePersist
//    public void prePersist() {
//        this.createdAt = LocalDateTime.now();
//        this.updatedAt = LocalDateTime.now();
//    }
//
//    @PreUpdate
//    public void preUpdate() {
//        this.updatedAt = LocalDateTime.now();
//    }

}
