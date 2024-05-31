package com.backend.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.backend.entity.Meeting;

public interface MeetingRepository extends JpaRepository<Meeting, Long> {

    List<Meeting> findByUserId(Long userId);
}
