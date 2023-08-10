package com.example.coursemanagementsystem.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "topic")
    private String topic;

    @Column(name = "content")
    private String content;

    @OneToOne
    private Classes classes;

    @OneToMany(mappedBy = "notification")
    private List<UserNotification> userNotifications = new ArrayList<>();
}
