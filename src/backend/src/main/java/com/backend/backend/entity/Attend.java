package com.backend.backend.entity;

import java.time.LocalDate;

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
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
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

    @ManyToOne(optional=false)
    @JoinColumn(name = "participant_id")
    private Participant participant;//참여자 정보

    @Column(nullable=false)
    private LocalDate date;//일시

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private AttendStatus attendStatus;//출석정보


    @Builder
    public Attend(Participant participant, LocalDate date, AttendStatus attendStatus) {
        this.participant = participant;
        this.date = date;
        this.attendStatus = attendStatus;
    }

        
}