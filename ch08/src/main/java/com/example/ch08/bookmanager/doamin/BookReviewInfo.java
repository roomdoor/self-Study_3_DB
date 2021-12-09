package com.example.ch08.bookmanager.doamin;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity
@Data
@NoArgsConstructor
public class BookReviewInfo extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

//    private Long bookId;

    @OneToOne (optional = false)//@OneToOne 1:1 로 연관관계 mapping // optional -> 기본값 true  false 로 바꾸면 notNull(반드시 존재하는 값)
    private Book book;

    private float averageReviewScore;

    private int reviewCount;



}
