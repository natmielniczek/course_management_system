package com.example.coursemanagementsystem.service;

import com.example.coursemanagementsystem.dto.CourseDto;
import com.example.coursemanagementsystem.model.Course;
import com.example.coursemanagementsystem.repository.CourseRepository;
import com.example.coursemanagementsystem.util.mapper.CourseMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseRepository courseRepository;

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public CourseDto addCourse(CourseDto courseDto) {
        Course course = CourseMapper.toCourse(courseDto);
        Course addedCourse = courseRepository.save(course);
        return CourseMapper.toCourseDto(addedCourse);
    }
}
