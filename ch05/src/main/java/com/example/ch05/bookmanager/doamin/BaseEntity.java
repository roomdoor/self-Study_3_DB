package com.example.ch05.bookmanager.doamin;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

// 모든 entity 에 createdAt, updatedAt 자동으로 넢기 위한 값
//@EqualsAndHashCode(callSuper = true)    // BaseEntity 사용해서 모든 entity 에 createdAt, updatedAt 자동으로 넣으려면 필요
//@ToString(callSuper = true)             // BaseEntity 사용해서 모든 entity 에 createdAt, updatedAt 자동으로 넣으려면 필요
@EntityListeners(value = AuditingEntityListener.class)
@Data
@MappedSuperclass
public class BaseEntity {
    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;
}
