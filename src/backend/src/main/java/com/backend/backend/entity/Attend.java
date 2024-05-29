package com.backend.backend.entity;

import java.util.Date;

import com.backend.backend.domain.AttendStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "attend")
@Entity
public class Attend {
    

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;//자동 아이디

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;//유저정보

    @ManyToOne
    @JoinColumn(name = "meeting_id")
    private Meeting meeting;//모임정보

    @Column
    private Date date;//일시

    @Enumerated(EnumType.STRING)//열 자동 생성
    private AttendStatus attendStatus;//출석정보

        
}