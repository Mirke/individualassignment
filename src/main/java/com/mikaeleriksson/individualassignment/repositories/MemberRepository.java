package com.mikaeleriksson.individualassignment.repositories;

import com.mikaeleriksson.individualassignment.entities.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,Long> {
}
