package com.example.coursemanagementsystem.util.mapper;

import com.example.coursemanagementsystem.dto.BlockOfClassesDto;
import com.example.coursemanagementsystem.model.BlockOfClasses;

public class BlockOfClassesMapper {

    public static BlockOfClasses toBlockOfClasses(BlockOfClassesDto blockOfClassesDto) {
        BlockOfClasses blockOfClasses = new BlockOfClasses();
        blockOfClasses.setBlockName(blockOfClassesDto.getBlockName());
        blockOfClasses.setId(blockOfClassesDto.getId());
        // course needs to be retrieved separately from the CourseRepository
        // blockOfClasses.setCourse(CourseMapper.toCourse(blockOfClassesDto.getCourseDto()));
        return blockOfClasses;
    }

    public static BlockOfClassesDto toBlockOfClassesDto(BlockOfClasses blockOfClasses) {
        BlockOfClassesDto blockOfClassesDto = new BlockOfClassesDto();
        blockOfClassesDto.setBlockName(blockOfClasses.getBlockName());
        blockOfClassesDto.setCourseId(blockOfClasses.getCourse().getId());
        blockOfClassesDto.setId(blockOfClasses.getId());
        return blockOfClassesDto;
    }

}
