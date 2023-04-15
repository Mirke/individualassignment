package com.mikaeleriksson.individualassignment.repositories;

import com.mikaeleriksson.individualassignment.entities.Member;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * <code>MemberRepository</code> - Implements Jpa methods for Member entity
 * @author Mikael Eriksson (mikael.eriksson@edu.edugrade.se)
 * @version 1.0.0
 */

public interface MemberRepository extends JpaRepository<Member,Long> {
}

