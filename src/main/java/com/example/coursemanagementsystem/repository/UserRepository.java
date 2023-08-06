package com.example.coursemanagementsystem.repository;

import com.example.coursemanagementsystem.model.UserEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntry, Long> {

}
