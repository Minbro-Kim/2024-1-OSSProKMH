package com.backend.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.backend.entity.Attend;

public interface AttendRepository extends JpaRepository<Attend, Long> {

    
}
