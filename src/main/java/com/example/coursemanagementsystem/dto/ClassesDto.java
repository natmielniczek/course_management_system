package com.example.coursemanagementsystem.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class ClassesDto {

    private String topic;
    private LocalDate date;
    private BlockOfClassesDto blockOfClassesDto;
    private NotificationDto notificationDto;
}
