package com.example.coursemanagementsystem.util.mapper;

import com.example.coursemanagementsystem.dto.ClassesDto;
import com.example.coursemanagementsystem.model.Classes;

public class ClassesMapper {

    public static Classes toClasses(ClassesDto classesDto) {
        Classes classes = new Classes();
        classes.setTopic(classesDto.getTopic());
        classes.setDate(classesDto.getDate());
        //classes.setBlockOfClasses(BlockOfClassesMapper.toBlockOfClasses(classesDto.getBlockOfClassesDto()));
        classes.setNotification(NotificationMapper.toNotification(classesDto.getNotificationDto()));
        return classes;
    }

    public static ClassesDto toClassesDto(Classes classes) {
        ClassesDto classesDto = new ClassesDto();
        classesDto.setTopic(classes.getTopic());
        classesDto.setDate(classes.getDate());
        classesDto.setBlockOfClassesId(classes.getBlockOfClasses().getId());
        classesDto.setNotificationDto(NotificationMapper.toNotificationDto(classes.getNotification()));
        return classesDto;
    }
}
