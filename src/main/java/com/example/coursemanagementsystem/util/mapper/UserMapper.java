package com.example.coursemanagementsystem.util.mapper;

import com.example.coursemanagementsystem.dto.UserDto;
import com.example.coursemanagementsystem.model.User;

public class UserMapper {

    public static User toUser(UserDto userDto) {
        User user = new User();
        user.setLogin(userDto.getLogin());
        user.setPassword(userDto.getPassword());
        user.setType(userDto.getType());
        user.setName(userDto.getName());
        user.setSurname(userDto.getSurname());
        user.setActive(userDto.isActive());
        return user;
    }
    public static UserDto toUserDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setLogin(user.getLogin());
        userDto.setPassword(user.getPassword());
        userDto.setType(user.getType());
        userDto.setName(user.getName());
        userDto.setSurname(user.getSurname());
        userDto.setActive(user.isActive());
        return userDto;
    }
}
