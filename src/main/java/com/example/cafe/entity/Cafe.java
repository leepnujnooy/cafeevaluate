package com.example.cafe.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "cafe")
public class Cafe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private String category;

    @Column
    private Integer start_at;


    @Column
    private String address_common;

    @Column
    private String address_doro;

    @OneToMany(mappedBy = "cafe", fetch = FetchType.EAGER)
    private List<Comment> commentList = new ArrayList<>();

}
