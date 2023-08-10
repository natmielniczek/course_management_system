package com.example.coursemanagementsystem.util.mapper;

import com.example.coursemanagementsystem.dto.CourseDto;
import com.example.coursemanagementsystem.model.Course;

public class CourseMapper {

    public static Course toCourse(CourseDto courseDto) {
        Course course = new Course();
        course.setCourseName(courseDto.getCourseName());
        course.setBlockOfClasses(courseDto.getBlockOfClassesDto().stream().map(BlockOfClassesMapper::toBlockOfClasses).toList());
        return course;
    }

    public static CourseDto toCourseDto(Course course) {
        CourseDto courseDto = new CourseDto();
        courseDto.setCourseName(course.getCourseName());
        courseDto.setBlockOfClassesDto(course.getBlockOfClasses().stream().map(BlockOfClassesMapper::toBlockOfClassesDto).toList());
        return courseDto;
    }
}
