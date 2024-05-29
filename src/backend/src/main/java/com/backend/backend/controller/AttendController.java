package com.backend.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.backend.backend.dto.AttendRequest;
import com.backend.backend.entity.Attend;
import com.backend.backend.service.AttendService;

@RestController
public class AttendController {

    @Autowired
    private AttendService attendService;

    @PostMapping("/check-in")
    public ResponseEntity<Attend> checkIn(@RequestBody AttendRequest request) {
        Attend checked = attendService.checkIn(request);
                
        return (checked != null) ?
                ResponseEntity.status(HttpStatus.OK).body(checked):
                ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

}
