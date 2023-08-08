package com.example.coursemanagementsystem.controller;

import com.example.coursemanagementsystem.dto.BlockOfClassesDto;
import com.example.coursemanagementsystem.model.BlockOfClasses;
import com.example.coursemanagementsystem.service.BlockOfClassesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/block")
@RequiredArgsConstructor
public class BlockOfClassesController {

    private final BlockOfClassesService blockOfClassesService;

    @GetMapping
    public ResponseEntity<List<BlockOfClasses>> getAllBlockOfClasses() {
       try {
           List<BlockOfClasses> blockOfClasses = blockOfClassesService.getAllBlockOfClasses();
           return ResponseEntity.ok(blockOfClasses);
       } catch (Exception e) {
           return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
       }
    }

    @PostMapping
    public ResponseEntity<BlockOfClassesDto> addBlockOfClasses(@RequestBody BlockOfClassesDto blockOfClassesDto) {
        try {
            BlockOfClassesDto addedBlockOfClassesDto = blockOfClassesService.addBlockOfClasses(blockOfClassesDto);
            return ResponseEntity.ok(addedBlockOfClassesDto);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }
}
