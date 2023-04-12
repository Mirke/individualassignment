package com.mikaeleriksson.individualassignment.services;

import com.mikaeleriksson.individualassignment.entities.Member;
import com.mikaeleriksson.individualassignment.exceptions.ResourceNotFoundException;
import com.mikaeleriksson.individualassignment.repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService implements  MemberServiceInterface {

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }

    @Override
    public Member addMember(Member member) {
        return memberRepository.save(member);
    }

    @Override
    public void deleteMember(long id) {
        memberRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Member", "Id", id));
        memberRepository.deleteById(id);
    }

    @Override
    public Member updateMember(Member member, long id) {
        Member m = memberRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Member", "Id", id));
        m.setFirstName(member.getFirstName());
        m.setLastName(member.getLastName());
        m.setEmail(member.getEmail());
        m.setPhone(member.getPhone());
        m.setDateOfBirth(member.getDateOfBirth());
        memberRepository.save(m);
        return m;
    }
}