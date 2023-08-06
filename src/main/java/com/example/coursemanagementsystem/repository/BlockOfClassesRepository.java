package com.example.coursemanagementsystem.repository;

import com.example.coursemanagementsystem.model.BlockOfClasses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlockOfClassesRepository extends JpaRepository<BlockOfClasses, Long> {
}
