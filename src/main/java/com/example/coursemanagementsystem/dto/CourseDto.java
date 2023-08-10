package com.example.coursemanagementsystem.dto;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CourseDto {

    private String courseName;
    private List<BlockOfClassesDto> blockOfClassesDto;
}
