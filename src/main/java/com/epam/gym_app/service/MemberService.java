package com.epam.gym_app.service;

import com.epam.gym_app.model.Member;
import com.epam.gym_app.model.MembersList;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;



import java.util.List;

@Slf4j
@Service
public class MemberService {
//
//    private final JmsTemplate jmsTemplate;
//
//    @Autowired
//    public MemberService(JmsTemplate jmsTemplate) {this.jmsTemplate = jmsTemplate;}
//
//    public void addMember(String username) {
//        log.info("Adding member with username: {} ", username);
//        jmsTemplate.convertAndSend("addMemberQueue", username);
//    }
//
//    public void deleteMember(String memberId) {
//        log.info("Deleting member: {} ", memberId);
//        jmsTemplate.convertAndSend("deleteMemberQueue", memberId);
//    }
//
//    public List<Member> getMembers() {
//        log.info("Sending request for member data to statistics-app");
//        jmsTemplate.convertAndSend("requestMembersQueue", "Request for members");
//
//        log.info("Waiting to receive members from responseMembersQueue");
//        String jsonResponse = (String) jmsTemplate.receiveAndConvert("responseMembersQueue");
//
//        if (jsonResponse == null) {
//            log.warn("No response received from responseMembersQueue");
//            return null;
//        }
//
//        MembersList membersList = MembersList.fromJson(jsonResponse);
//        if (membersList == null) {
//            log.warn("No MembersList received from responseMembersQueue");
//            return null;
//        }
//
//        List<Member> members = membersList.getMembers();
//        for (Member member : members) {
//            log.info("Member id from getMemebers(): {}", member.getId());
//        }
//
//        return members;
//    }
}
