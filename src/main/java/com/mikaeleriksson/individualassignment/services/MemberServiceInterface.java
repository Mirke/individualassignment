package com.mikaeleriksson.individualassignment.services;

import com.mikaeleriksson.individualassignment.entities.Address;
import com.mikaeleriksson.individualassignment.entities.Member;

import java.util.List;

public interface MemberServiceInterface {
    List<Member> getAllMembers();
    Member addMember(Member member);
    void deleteMember(long id);
    Member updateMember(Member member, long id);
}
