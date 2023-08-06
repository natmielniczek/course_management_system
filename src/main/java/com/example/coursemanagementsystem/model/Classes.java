package com.example.coursemanagementsystem.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Classes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "topic")
    private String topic;

    @Column(name = "date", columnDefinition = "TIMESTAMP")
    private LocalDate date;

    @ManyToOne
    private BlockOfClasses blockOfClasses;

    @OneToOne
    private Notification notification;
}
