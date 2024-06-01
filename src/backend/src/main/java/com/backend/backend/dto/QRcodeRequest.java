package com.backend.backend.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class QRcodeRequest {

    private Long id;
    private LocalDate date;
    private LocalDateTime attendanceTime; // 출석 시간
    private LocalDateTime lateTime; // 지각 시간
}
