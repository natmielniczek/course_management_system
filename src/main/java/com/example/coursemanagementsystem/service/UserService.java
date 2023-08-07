package com.example.coursemanagementsystem.service;

import com.example.coursemanagementsystem.dto.UserDto;
import com.example.coursemanagementsystem.model.UserEntry;
import com.example.coursemanagementsystem.repository.UserRepository;
import com.example.coursemanagementsystem.util.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<UserEntry> getAllUsers() {
        return userRepository.findAll();
    }
    public UserDto addUser(UserDto userDto) {
        UserEntry userEntry = UserMapper.toUser(userDto);
        UserEntry addedUserEntry = userRepository.save(userEntry);
        return UserMapper.toUserDto(addedUserEntry);
    }

    public UserEntry updateUser(UserEntry user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
