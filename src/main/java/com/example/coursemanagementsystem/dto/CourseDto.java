package com.example.coursemanagementsystem.dto;

import com.example.coursemanagementsystem.model.BlockOfClasses;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CourseDto {

    private String courseName;
    private List<BlockOfClasses> blockOfClasses;
}
