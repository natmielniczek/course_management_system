package com.example.coursemanagementsystem.controller;

import com.example.coursemanagementsystem.dto.BlockOfClassesDto;
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

    /*
     * { }
     */
    @GetMapping
    public ResponseEntity<List<BlockOfClassesDto>> getAllBlockOfClassesDto() {
       try {
           List<BlockOfClassesDto> blockOfClassesDto = blockOfClassesService.getAllBlockOfClasses();
           return ResponseEntity.ok(blockOfClassesDto);
       } catch (Exception e) {
           return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
       }
    }

    /*
     * {
     *     "blockName": <name>,
     *     "courseId": <courseId>
     * }
     */
    @PostMapping
    public ResponseEntity<BlockOfClassesDto> addBlockOfClasses(@RequestBody BlockOfClassesDto blockOfClassesDto) {
        try {
            BlockOfClassesDto addedBlockOfClassesDto = blockOfClassesService.upsertBlockOfClasses(blockOfClassesDto);
            return ResponseEntity.ok(addedBlockOfClassesDto);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    /*
     * {
     *     "id": <id>
     *     "blockName": <name>,
     *     "courseId": <courseId>
     * }
     */
    @PutMapping
    public ResponseEntity<BlockOfClassesDto> updateBlockOfClasses(@RequestBody BlockOfClassesDto blockOfClasses) {
        try {
            BlockOfClassesDto updateBlock = blockOfClassesService.upsertBlockOfClasses(blockOfClasses);
            return ResponseEntity.ok(updateBlock);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    /*
     * {
     *     "id": <id>
     * }
     */
    @DeleteMapping
    public ResponseEntity<Void> deleteBlockOfClasses(@RequestBody BlockOfClassesDto blockOfClassesDto) {
        try {
            blockOfClassesService.deleteBlockOfClasses(blockOfClassesDto.getId());
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }
}
