package com.example.coursemanagementsystem.controller;

import com.example.coursemanagementsystem.dto.UserDto;
import com.example.coursemanagementsystem.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
@RequiredArgsConstructor
public class AdminController {

    private final AdminService adminService;

    @PostMapping
    public ResponseEntity<UserDto> addInstructor(@RequestBody UserDto instructorDto) {
        try {
            UserDto addedInstructor = adminService.addInstructor(instructorDto);
            return ResponseEntity.ok(addedInstructor);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }
}
