package com.example.coursemanagementsystem.util.mapper;

import com.example.coursemanagementsystem.dto.UserNotificationDto;
import com.example.coursemanagementsystem.model.UserNotification;

public class UserNotificationMapper {

    public static UserNotification toUserNotification(UserNotificationDto userNotificationDto) {
        UserNotification userNotification = new UserNotification();
        userNotification.setWasRead(userNotificationDto.isWasRead());
        userNotification.setNotification(NotificationMapper.toNotification(userNotificationDto.getNotificationDto()));
        userNotification.setUserEntry(UserMapper.toUser(userNotificationDto.getUserDto()));
        return userNotification;
    }

    public static UserNotificationDto toUserNotificationDto(UserNotification userNotification) {
        UserNotificationDto userNotificationDto = new UserNotificationDto();
        userNotificationDto.setWasRead(userNotification.isWasRead());
        userNotificationDto.setNotificationDto(NotificationMapper.toNotificationDto(userNotification.getNotification()));
        userNotificationDto.setUserDto(UserMapper.toUserDto(userNotification.getUserEntry()));
        return  userNotificationDto;
    }
}
