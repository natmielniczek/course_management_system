package com.example.coursemanagementsystem.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserNotificationDto {

    private boolean wasRead;
    private NotificationDto notificationDto;
    private UserDto userDto;
}
