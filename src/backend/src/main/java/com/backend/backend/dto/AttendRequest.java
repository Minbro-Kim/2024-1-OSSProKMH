package com.backend.backend.dto;

import java.util.Date;

import com.backend.backend.domain.AttendStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class AttendRequest {

    private Long id;
    private Long meetingId;
    private Date date;
    private AttendStatus attendStatus;

    

}
