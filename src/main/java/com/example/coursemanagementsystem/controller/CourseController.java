package com.example.coursemanagementsystem.controller;

import com.example.coursemanagementsystem.dto.CourseDto;
import com.example.coursemanagementsystem.model.Course;
import com.example.coursemanagementsystem.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/course")
@RequiredArgsConstructor
public class CourseController {

    private final CourseService courseService;

    @GetMapping
    public ResponseEntity<List<CourseDto>> getAllCourses() {
        try {
            List<CourseDto> coursesDto = courseService.getAllCourses();
            return ResponseEntity.ok(coursesDto);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PostMapping
    public ResponseEntity<CourseDto> addCourse(@RequestBody CourseDto courseDto) {
        try {
            CourseDto addedCourseDto = courseService.addCourse(courseDto);
            return ResponseEntity.ok(addedCourseDto);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @PutMapping
    public ResponseEntity<Course> updateCourse(@RequestBody Course course) {
        try {
            Course updateCourse = courseService.updateCourse(course);
            return ResponseEntity.ok(updateCourse);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }
}
