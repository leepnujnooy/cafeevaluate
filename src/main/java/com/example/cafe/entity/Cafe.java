package com.example.cafe.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "cafe_gwanak")
public class Cafe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private Integer start_at;

    @Column
    private String is_open;

    @Column
    private String is_closed;

    @Column
    private String category;

    @Column
    private String address_doro;

    @Column
    private String address_common;

}
