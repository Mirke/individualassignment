package com.mikaeleriksson.individualassignment.services;

import com.mikaeleriksson.individualassignment.entities.Address;
import com.mikaeleriksson.individualassignment.entities.Member;
import com.mikaeleriksson.individualassignment.exceptions.ResourceNotFoundException;
import com.mikaeleriksson.individualassignment.repositories.AddressRepository;
import com.mikaeleriksson.individualassignment.repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * <code>MemberService</code> - Serves the Member entity to the repository
 * @author Mikael Eriksson (mikael.eriksson@edu.edugrade.se)
 * @version 1.0.0
 */

@Service
public class MemberService implements  MemberServiceInterface {

    // -----------------------------------------------------------------------------------------------------------------
    //   Properties
    // -----------------------------------------------------------------------------------------------------------------

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private AddressService addressService;

    // -----------------------------------------------------------------------------------------------------------------
    //   Methods
    // -----------------------------------------------------------------------------------------------------------------

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
        Address a = addressRepository.findById(m.getAddress().getPostalCode()).orElseThrow(() -> new ResourceNotFoundException("Address", "Id", m.getAddress().getPostalCode()));
        m.setFirstName(member.getFirstName());
        m.setLastName(member.getLastName());
        m.setEmail(member.getEmail());
        m.setPhone(member.getPhone());
        m.setDateOfBirth(member.getDateOfBirth());
        if(a.getPostalCode() == member.getAddress().getPostalCode()){
            m.setAddress(addressService.updateAddress(member.getAddress(), a.getPostalCode()));
        } else {
            m.setAddress(addressService.addAddress(member.getAddress()));
        }
        memberRepository.save(m);
        return m;
    }
}
