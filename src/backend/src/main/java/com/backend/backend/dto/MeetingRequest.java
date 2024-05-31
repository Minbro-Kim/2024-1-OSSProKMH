package com.backend.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class MeetingRequest {

    private Long id;
    private String meetingName;



}
