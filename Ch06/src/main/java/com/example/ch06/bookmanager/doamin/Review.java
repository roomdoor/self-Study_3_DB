package com.example.ch06.bookmanager.doamin;

import lombok.*;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@NoArgsConstructor
@Data
@Entity
public class Review extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String Title;

    private String content;

    private float score;

    @ManyToOne
    private User user;

    @ManyToOne
    private Book book;

}
