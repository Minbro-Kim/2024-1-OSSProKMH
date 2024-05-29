package com.backend.backend.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.backend.domain.AttendStatus;
import com.backend.backend.dto.AttendRequest;
import com.backend.backend.entity.Attend;
import com.backend.backend.entity.Meeting;
import com.backend.backend.entity.User;
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
    
    //출석 처리
    public Attend checkIn(AttendRequest request) {
        
        Attend attend = toEntity(request);
        if(attend.getId() != null){
            return null;
        }
        return attendRepository.save(attend);
    }

     // DTO를 엔티티로 변환하는 메서드
    private Attend toEntity(AttendRequest request) {
        Long id = request.getId();
        User user = userRepository.findById(request.getUserId()).orElse(null);
        Meeting meeting = meetingRepository.findById(request.getMeetingId()).orElse(null);
        Date date = request.getDate();
        AttendStatus attendStatus = request.getAttendStatus();
        return new Attend(id,user,meeting,date,attendStatus);
    }
    // 엔티티를 DTO로 변환하는 메서드

    // public AttendRequest toDTO(Attend attend) {
    //     Long id = attend.getId();
    //     Long userId = attend.getUser().getId();
    //     Long meetingId = attend.getMeeting().getId();
    //     Date date = attend.getDate();
    //     AttendStatus attendStatus = attend.getAttendStatus();
    //     return new AttendRequest(id, userId, meetingId, date, attendStatus);
    // }
    
}
