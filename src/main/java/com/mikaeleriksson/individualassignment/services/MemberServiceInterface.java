package com.mikaeleriksson.individualassignment.services;

import com.mikaeleriksson.individualassignment.entities.Member;
import java.util.List;

/**
 * <code>MemberServiceInterface</code> - Interface for Member service
 * @author Mikael Eriksson (mikael.eriksson@edu.edugrade.se)
 * @version 1.0.0
 */

public interface MemberServiceInterface {
    List<Member> getAllMembers();
    Member addMember(Member member);
    void deleteMember(long id);
    Member updateMember(Member member, long id);
}
