package com.example.cafe.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String content;


    @ManyToOne
    @JoinColumn(name = "cafe_id")
    private Cafe cafe;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;




}
