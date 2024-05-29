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
import lombok.ToString;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "meetings")
@Entity
public class Meeting {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;//자동 아이디

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;//주최자정보

    // @Column
    // private Date date;//일시

}
