package com.example.coursemanagementsystem.service;

import com.example.coursemanagementsystem.dto.BlockOfClassesDto;
import com.example.coursemanagementsystem.model.BlockOfClasses;
import com.example.coursemanagementsystem.model.Course;
import com.example.coursemanagementsystem.repository.BlockOfClassesRepository;
import com.example.coursemanagementsystem.repository.CourseRepository;
import com.example.coursemanagementsystem.util.mapper.BlockOfClassesMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BlockOfClassesService {

    private final BlockOfClassesRepository blockOfClassesRepository;
    private final CourseRepository courseRepository;

    public List<BlockOfClassesDto> getAllBlockOfClasses() {
        return blockOfClassesRepository.findAll().stream()
                .map(BlockOfClassesMapper::toBlockOfClassesDto)
                .toList();

    }

    public BlockOfClassesDto upsertBlockOfClasses(BlockOfClassesDto blockOfClassesDto) {
        BlockOfClasses blockOfClasses = BlockOfClassesMapper.toBlockOfClasses(blockOfClassesDto);

        // finding course needs to be done outside toBlockOfClasses
        Course course = courseRepository.getReferenceById(blockOfClassesDto.getCourseId());
        blockOfClasses.setCourse(course);

        BlockOfClasses addedBlockOfClasses = blockOfClassesRepository.save(blockOfClasses);
        return BlockOfClassesMapper.toBlockOfClassesDto(addedBlockOfClasses);
    }

    public void deleteBlockOfClasses(Long id) {
        blockOfClassesRepository.deleteById(id);
    }
}
