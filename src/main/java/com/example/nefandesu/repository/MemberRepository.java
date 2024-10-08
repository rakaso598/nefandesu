package com.example.nefandesu.repository;

import com.example.nefandesu.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByMemberName(String memberName);

    Optional<Member> findByEmail(String email);
}
