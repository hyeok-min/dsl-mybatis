package com.example.demo.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Getter
public class Member {
    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name;        //이름
    private String password;    //비밀번호
    private String nickname;    //닉네임
    private String email;       //이메일(아이디)

    @Builder
    public Member(Long id,String name,String email,String nickname,String password){
        this.id=id;
        this.name=name;
        this.email=email;
        this.password=password;
        this.nickname=nickname;
    }
}
