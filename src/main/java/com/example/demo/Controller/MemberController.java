package com.example.demo.Controller;

import com.example.demo.Dto.MemberDto;
import com.example.demo.entity.Member;
import com.example.demo.mapper.MemberMapper;
import com.example.demo.repository.MemberRepositoryCustom;
import com.example.demo.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;
    private final MemberMapper memberMapper;
    private final MemberRepositoryCustom memberRepositoryCustom;
    @GetMapping("/member")
    public List<Member> getMember(){
        List<Member> member=memberService.findMember();
        return member;
    }

    @PostMapping("/member/new")
    public Member newMember(@RequestBody MemberDto memberDto){
        return memberService.addMember(memberDto);
    }

    @GetMapping("/membertest")
    public ResponseEntity testmember(){
        List<Member> member = memberMapper.getMember();
        return ResponseEntity.ok(member);
    }

    @GetMapping("/memberquerytest")
    public ResponseEntity test2member(){
        List<Member> member=memberRepositoryCustom.testmember();
        return ResponseEntity.ok(member);
    }
}
