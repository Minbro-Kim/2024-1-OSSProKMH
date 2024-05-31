package com.backend.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "participants")
@Entity
public class Participant {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;//자동 아이디

    @ManyToOne(optional=false)
    @JoinColumn(name = "meeting_id")
    private Meeting meeting;//모임정보

    @ManyToOne(optional=false)
    @JoinColumn(name = "user_id")
    private User user;//참여자정보


    
}
