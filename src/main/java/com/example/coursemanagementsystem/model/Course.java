package com.example.coursemanagementsystem.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "course_name")
    private String courseName;

    @OneToMany(mappedBy = "course")
    private List<BlockOfClasses> blockOfClasses = new ArrayList<>();
}
