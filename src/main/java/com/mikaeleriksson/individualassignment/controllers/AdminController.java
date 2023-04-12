package com.mikaeleriksson.individualassignment.controllers;

import com.mikaeleriksson.individualassignment.entities.Member;
import com.mikaeleriksson.individualassignment.repositories.MemberRepository;
import com.mikaeleriksson.individualassignment.services.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminController {

    @Autowired
    private MemberService memberService;

    @Autowired
    private MemberRepository memberRepository;

    @GetMapping("/admin/members")
    public List<Member> getAllMembers(){
        return memberService.getAllMembers();
    }

    @PostMapping("/admin/addmember")
    public ResponseEntity<Member> addMember(@RequestBody Member member){
        return new ResponseEntity<Member>(memberService.addMember(member), HttpStatus.CREATED);
    }
    //Maybe change this so I can delete by json
    @DeleteMapping("/admin/delete/{id}")
    public ResponseEntity<String> deleteMember(@PathVariable Long id){
        memberService.deleteMember(id);
        return new ResponseEntity<String>("Member deleted!", HttpStatus.OK);    }

    @PutMapping("admin/member/{id}")
    public ResponseEntity<Member> updateMember(@PathVariable("id") long id, @RequestBody Member member) {
        return ResponseEntity.ok(memberService.updateMember(member, id));
    }

}
