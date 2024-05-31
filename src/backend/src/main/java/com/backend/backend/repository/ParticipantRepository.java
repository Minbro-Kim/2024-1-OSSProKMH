package com.backend.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.backend.entity.Participant;

public interface ParticipantRepository extends JpaRepository<Participant, Long>{

    // 모임 ID와 사용자 아이디로 참여자를 조회하는 메서드
    <Optional>Participant findByMeetingIdAndUserId(Long meetingId, Long userId);
}
