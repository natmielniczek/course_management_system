package com.example.coursemanagementsystem.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class BlockOfClasses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "block_name")
    private String blockName;

    @ManyToOne
    private Course course;

    @OneToMany (mappedBy = "block_of_classes")
    private List<Classes> classes = new ArrayList<>();
}
