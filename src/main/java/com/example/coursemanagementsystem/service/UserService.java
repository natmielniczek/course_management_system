package com.example.coursemanagementsystem.service;

import com.example.coursemanagementsystem.dto.UserDto;
import com.example.coursemanagementsystem.model.User;
import com.example.coursemanagementsystem.repository.UserRepository;
import com.example.coursemanagementsystem.util.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserDto addUser(UserDto userDto) {
        User user = UserMapper.toUser(userDto);
        User addedUser = userRepository.save(user);
        return UserMapper.toUserDto(addedUser);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
