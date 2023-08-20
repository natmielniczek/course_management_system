package com.example.coursemanagementsystem.util.mapper;

import com.example.coursemanagementsystem.dto.UserDto;
import com.example.coursemanagementsystem.model.UserEntry;

public class UserMapper {

    public static UserEntry toUser(UserDto userDto) {
        UserEntry userEntry = new UserEntry();
        userEntry.setLogin(userDto.getLogin());
        userEntry.setType(userDto.getType());
        userEntry.setName(userDto.getName());
        userEntry.setSurname(userDto.getSurname());
        userEntry.setActive(userDto.isActive());
        return userEntry;
    }
    public static UserDto toUserDto(UserEntry userEntry) {
        UserDto userDto = new UserDto();
        userDto.setLogin(userEntry.getLogin());
        userDto.setType(userEntry.getType());
        userDto.setName(userEntry.getName());
        userDto.setSurname(userEntry.getSurname());
        userDto.setActive(userEntry.isActive());
        return userDto;
    }
}
