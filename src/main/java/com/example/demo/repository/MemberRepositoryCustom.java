package com.example.demo.repository;

import com.example.demo.entity.Member;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.example.demo.entity.QMember.member;

@Repository
@RequiredArgsConstructor
public class MemberRepositoryCustom {
    private final JPAQueryFactory queryFactory;

    public List<Member> testmember() {
        return queryFactory
                .selectFrom(member)
                .fetch();
    }

}
