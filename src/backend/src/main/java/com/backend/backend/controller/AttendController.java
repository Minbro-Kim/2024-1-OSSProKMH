package com.backend.backend.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.backend.backend.entity.Attend;
import com.backend.backend.service.AttendService;

@RestController
public class AttendController {

    @Autowired
    private AttendService attendService;

    // @PostMapping("/meetings/{meetingId}/check-in")
    // public  @ResponseBody ResponseEntity checkIn(@PathVariable Long meetingId, @RequestBody AttendRequest dto, Principal principal) {
    //     String email = principal.getName();//참여자
    //     Attend checked ;
    //     try {
    //         checked = attendService.checkIn(meetingId, dto, email);
            
    //     } catch (IllegalArgumentException e) {
    //         return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
    //     } catch (IllegalStateException e) {
    //         return new ResponseEntity<String>(e.getMessage(), HttpStatus.CONFLICT);
    //     } catch (Exception e) {
    //         return new ResponseEntity<String>("An unexpected error occurred.", HttpStatus.INTERNAL_SERVER_ERROR);
    //     }
    //     return new ResponseEntity<Attend>(checked, HttpStatus.OK);
    // }

    //참여자 출석 목록
    @GetMapping("/meetings/{meetingId}/attendance")
    public List<Attend> getParticipantAttendance (@PathVariable Long meetingId, Principal principal) {
        String email = principal.getName();
        return attendService.getParticipantAttendance(meetingId,email);
    }

    

}
