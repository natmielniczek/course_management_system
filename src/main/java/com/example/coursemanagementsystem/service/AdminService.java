package com.example.coursemanagementsystem.service;

import com.example.coursemanagementsystem.dto.UserDto;
import com.example.coursemanagementsystem.model.UserEntry;
import com.example.coursemanagementsystem.model.UserType;
import com.example.coursemanagementsystem.repository.UserRepository;
import com.example.coursemanagementsystem.util.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminService {

    private final UserRepository userRepository;

    public UserDto addInstructor(UserDto instructorDto) {
        UserEntry instructor = new UserEntry();
        instructor.setLogin(instructorDto.getLogin());
        instructor.setType(UserType.INSTRUCTOR);
        instructor.setName(instructorDto.getName());
        instructor.setSurname(instructorDto.getSurname());
        instructor.setActive(instructorDto.isActive());
        UserEntry addedInstructor = userRepository.save(instructor);
        return UserMapper.toUserDto(addedInstructor);
    }
}
