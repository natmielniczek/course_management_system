package com.example.coursemanagementsystem.controller;

import com.example.coursemanagementsystem.dto.UserDto;
import com.example.coursemanagementsystem.model.UserEntry;
import com.example.coursemanagementsystem.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<UserDto> addUser(@RequestBody UserDto userDto) {
        try {
            UserDto addedUserDto = userService.addUser(userDto);
            return ResponseEntity.ok(addedUserDto);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<UserEntry>> getAllUsers() {
        try {
            List<UserEntry> userEntries = userService.getAllUsers();
            return ResponseEntity.ok(userEntries);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }


}
