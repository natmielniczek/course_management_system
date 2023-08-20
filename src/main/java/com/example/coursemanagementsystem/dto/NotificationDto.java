package com.example.coursemanagementsystem.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class NotificationDto {

    private String topic;
    private String content;
    private ClassesDto classesDto;

}
