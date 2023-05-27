package com.example.cafe.dto;


import lombok.*;

import java.time.LocalDateTime;

//DATA TRANSFER OBJECT 라고 해서, 데이터를 전송해주는 객체라고 생각하면된다
//VO BEAN 도 비슷한 의미임
//ENTITY 는 다른거임
@Getter
@Setter
@ToString
@NoArgsConstructor // 기본 생성자
@AllArgsConstructor // 모든 필드를 매개변수로 하는 생성자
public class CafeDTO {
    private Integer id;
    private String name;
    private LocalDateTime start_at;
    private String is_open;
    private String is_closed;
    private String category;
    private String address_doro;
    private String address_common;
}

