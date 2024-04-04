package com.example.demo.domain;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED) // access 권한 설정(찾아보기)
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Auto Increment > 데이터가 추가 될 때 마다, 자동으로 데이터 증가
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

}
