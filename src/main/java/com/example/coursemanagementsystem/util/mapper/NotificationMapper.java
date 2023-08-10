package com.example.coursemanagementsystem.util.mapper;

import com.example.coursemanagementsystem.dto.NotificationDto;
import com.example.coursemanagementsystem.model.Notification;

public class NotificationMapper {

    public static Notification toNotification(NotificationDto notificationDto) {
        Notification notification = new Notification();
        notification.setTopic(notificationDto.getTopic());
        notification.setContent(notificationDto.getContent());
        notification.setClasses(ClassesMapper.toClasses(notificationDto.getClassesDto()));
        notification.setUserNotifications(notificationDto.getUserNotificationDto().stream().map(UserNotificationMapper::toUserNotification).toList());
        return notification;
    }

    public static NotificationDto toNotificationDto(Notification notification) {
        NotificationDto notificationDto = new NotificationDto();
        notificationDto.setTopic(notification.getTopic());
        notificationDto.setContent(notification.getContent());
        notificationDto.setClassesDto(ClassesMapper.toClassesDto(notification.getClasses()));
        notificationDto.setUserNotificationDto(notification.getUserNotifications().stream().map(UserNotificationMapper::toUserNotificationDto).toList());
        return notificationDto;
    }
}
