package com.backend.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.backend.backend.service.AttendService;

@RestController
public class AttendController {

    @Autowired
    private AttendService attendService;

    // @PostMapping("/check-in")
    // public ResponseEntity<Attend> checkIn(@RequestBody AttendRequest request, Principal principal) {
    //     String email = principal.getName();
    //     Attend checked = attendService.checkIn(request, email);
                
    //     return (checked != null) ?
    //             ResponseEntity.status(HttpStatus.OK).body(checked):
    //             ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    // }

}
