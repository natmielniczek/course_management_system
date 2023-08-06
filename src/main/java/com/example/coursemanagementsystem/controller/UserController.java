package com.example.coursemanagementsystem.controller;

import com.example.coursemanagementsystem.dto.UserDto;
import com.example.coursemanagementsystem.model.User;
import com.example.coursemanagementsystem.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

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


}
