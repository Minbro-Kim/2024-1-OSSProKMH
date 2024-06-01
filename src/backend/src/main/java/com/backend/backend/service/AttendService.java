package com.backend.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.backend.backend.dto.AttendRequest;
import com.backend.backend.entity.Attend;
import com.backend.backend.entity.Meeting;
import com.backend.backend.entity.Participant;
import com.backend.backend.entity.User;
import com.backend.backend.repository.AttendRepository;
import com.backend.backend.repository.MeetingRepository;
import com.backend.backend.repository.ParticipantRepository;
import com.backend.backend.repository.UserRepository;

@Service
public class AttendService {

    @Autowired
    private AttendRepository attendRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private MeetingRepository meetingRepository;
    @Autowired
    private ParticipantRepository participantRepository;

    @Transactional
    public Attend checkIn(Long meetingId, AttendRequest dto, String email) {
        User user = userRepository.findByEmail(email).orElse(null);//참여자
        Meeting meeting = meetingRepository.findById(meetingId).orElse(null);
        
        //유저나 모임이 없는경우
        if (user == null || meeting == null) {
            throw new IllegalArgumentException("User or meeting not found.");
        }
        //참여자정보 확인
        Participant participant = participantRepository.findByMeetingIdAndUserId(meetingId, user.getId());
        if (participant == null) {
            throw new IllegalArgumentException("Participant not found for the given user and meeting.");
        }
    
        // 이미 출석되어 있는지 확인
        Attend existingAttend = attendRepository.findByParticipantAndDate(participant, dto.getDate()).orElse(null);
        if (existingAttend!=null) {
            throw new IllegalStateException("Attendance already exists for the given participant and date.");
        }

        Attend attend = Attend.builder()
                        .participant(participant)
                        .date(dto.getDate())
                        .attendStatus(dto.getAttendStatus())
                        .build();
    
        
        return attendRepository.save(attend);
    }

    public List<Attend> getParticipantAttendance(Long meetingId, String email) {
        User user = userRepository.findByEmail(email).orElse(null);//참여자
        Participant participant = participantRepository.findByMeetingIdAndUserId(meetingId, user.getId());
        return attendRepository.findByParticipant(participant);
    }
    
}
