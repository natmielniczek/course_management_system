package com.example.coursemanagementsystem.dto;

import com.example.coursemanagementsystem.model.Classes;
import com.example.coursemanagementsystem.model.Course;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BlockOfClassesDto {

    private String blockName;
    private Course course;
    private List<Classes> classes;

}
