package com.example.demo.Dto;

import com.example.demo.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberDto {
    private Long id;
    private String name;        //이름
    private String password;    //비밀번호
    private String nickname;    //닉네임
    private String email;       //이메일(아이디)

    public Member toEntitiy(){
        return Member.builder()
                .id(id)
                .name(name)
                .nickname(nickname)
                .email(email)
                .password(password)
                .build();
    }
}
