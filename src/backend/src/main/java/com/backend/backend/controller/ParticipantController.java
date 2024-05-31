package com.backend.backend.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.backend.entity.Participant;
import com.backend.backend.service.ParticipantService;

@RestController
public class ParticipantController {

    @Autowired
    private ParticipantService participantService;

    //모임 참여자 등록
    @PostMapping("/meetings/{meetingId}/register")
    public ResponseEntity<Participant> register(@PathVariable Long meetingId, Principal principal){
        String email = principal.getName();
        Participant participant = participantService.register(meetingId, email);
        return (participant !=null) ?
                ResponseEntity.status(HttpStatus.OK).body(participant):
                ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

    //모임 탈퇴
    @DeleteMapping("/meetings/{meetingId}/withdraw")
    public ResponseEntity<Participant> withdraw(@PathVariable Long meetingId, Principal principal){
        String email = principal.getName();
        Participant participant =  participantService.withdraw(meetingId, email);
        return ( participant != null) ?
                ResponseEntity.status(HttpStatus.NO_CONTENT).build():
                ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }
    
}
