package com.backend.backend.repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.backend.entity.Attend;
import com.backend.backend.entity.Participant;

public interface AttendRepository extends JpaRepository<Attend, Long> {

    Optional<Attend> findByParticipantAndDate(Participant participant, LocalDate date);

    List<Attend> findByParticipant(Participant participant);

    
}
