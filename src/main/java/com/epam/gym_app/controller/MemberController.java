package com.epam.gym_app.controller;

import com.epam.gym_app.model.Member;
import com.epam.gym_app.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@Controller
public class MemberController {

    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {this.memberService = memberService;}

    @GetMapping("/members")
    public String membersPage(Model model) {
        List<Member> members = memberService.getMembers();
        model.addAttribute("members", members);
        return "members";
    }

    @PostMapping("/members")
    @ResponseBody
    public void addMember(@RequestParam String username) {
        memberService.addMember(username);
    }

    // API endpoint to delete a member
    @DeleteMapping("/members/{id}")
    @ResponseBody
    public void deleteMember(@PathVariable String id) {
        log.info("PathVariable: {}", id);
        memberService.deleteMember(id);
    }
}
