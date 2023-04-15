package com.mikaeleriksson.individualassignment.controllers;

import com.mikaeleriksson.individualassignment.entities.Member;
import com.mikaeleriksson.individualassignment.repositories.MemberRepository;
import com.mikaeleriksson.individualassignment.services.AddressService;
import com.mikaeleriksson.individualassignment.services.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * <code>AdminController</code> - CRUD commands and paths
 * @author Mikael Eriksson (mikael.eriksson@edu.edugrade.se)
 * @version 1.0.0
 */

@RestController
public class AdminController {

    // -----------------------------------------------------------------------------------------------------------------
    //   Properties
    // -----------------------------------------------------------------------------------------------------------------

    @Autowired
    private MemberService memberService;

    @Autowired
    private AddressService addressService;

    // -----------------------------------------------------------------------------------------------------------------
    //   Methods CRUD
    // -----------------------------------------------------------------------------------------------------------------

    @GetMapping("/admin/members")
    public List<Member> getAllMembers(){
        return memberService.getAllMembers();
    }

    @PostMapping("/admin/addmember")
    public ResponseEntity<Member> addMember(@RequestBody Member member){
        addressService.addAddress(member.getAddress());
        return new ResponseEntity<Member>(memberService.addMember(member), HttpStatus.CREATED);
    }

    @DeleteMapping("/admin/delete/member-id")
    public ResponseEntity<String> deleteMember(@RequestBody Member member){
        memberService.deleteMember(member.getId());
        return new ResponseEntity<String>("Member deleted!", HttpStatus.OK);    }

    @PutMapping("admin/member/member-id")
    public ResponseEntity<Member> updateMember(@RequestBody Member member) {
        return ResponseEntity.ok(memberService.updateMember(member, member.getId()));
    }
}
