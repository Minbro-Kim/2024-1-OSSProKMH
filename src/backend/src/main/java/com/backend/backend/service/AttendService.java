package com.backend.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.backend.repository.AttendRepository;
import com.backend.backend.repository.MeetingRepository;
import com.backend.backend.repository.UserRepository;

@Service
public class AttendService {

    @Autowired
    private AttendRepository attendRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private MeetingRepository meetingRepository;
    
    // //출석 처리
    // public Attend checkIn(AttendRequest request, String email) {
        
    //     Attend attend = toEntity(request, email);
    //     if(attend.getId() != null){
    //         return null;
    //     }
    //     return attendRepository.save(attend);
    // }

    //  // DTO를 엔티티로 변환하는 메서드
    // private Attend toEntity(AttendRequest dto, String email) {
    //     User user = userRepository.findByEmail(email).orElse(null);
    //     Long id = dto.getId();
    //     String meetingName = dto.getMeetingName();

    //     Meeting meeting = meetingRepository.findById(request.getMeetingId()).orElse(null);
    //     Date date = dto.getDate();
    //     AttendStatus attendStatus = dto.getAttendStatus();
    //     return new Attend(id,user,meeting,date,attendStatus);
    // }
    
    
}
