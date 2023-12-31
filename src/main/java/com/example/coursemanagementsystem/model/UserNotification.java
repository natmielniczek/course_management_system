package com.example.coursemanagementsystem.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class UserNotification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "was_read")
    private boolean wasRead;

    @ManyToOne
    private Notification notification;

    @ManyToOne
    private UserEntry userEntry;
}
