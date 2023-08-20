package com.example.coursemanagementsystem.dto;

import com.example.coursemanagementsystem.model.UserType;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserDto {

    private String login;
    private UserType type;
    private String name;
    private String surname;
    private boolean active;

}
