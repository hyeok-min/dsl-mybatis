package com.example.demo.service;

import com.example.demo.Dto.MemberDto;
import com.example.demo.entity.Member;
import com.example.demo.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class MemberService {
    private final MemberRepository memberRepository;
    public List<Member> findMember(){
        return memberRepository.findAll();
    }

    @Transactional
    public Member addMember(MemberDto memberDto){
        Member member =memberDto.toEntitiy();
        return memberRepository.save(member);
    }
}
