package com.example.ch05.bookmanager.doamin;

import com.example.ch05.bookmanager.doamin.listener.Auditable;
import com.example.ch05.bookmanager.doamin.listener.MyEntityListener;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
@EntityListeners(value = MyEntityListener.class)
public class TestEntity implements Auditable {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    public LocalDateTime createdAt;

    public LocalDateTime updatedAt;

}
