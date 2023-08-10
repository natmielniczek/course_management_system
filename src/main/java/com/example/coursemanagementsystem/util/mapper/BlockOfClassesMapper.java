package com.example.coursemanagementsystem.util.mapper;

import com.example.coursemanagementsystem.dto.BlockOfClassesDto;
import com.example.coursemanagementsystem.model.BlockOfClasses;

public class BlockOfClassesMapper {

    public static BlockOfClasses toBlockOfClasses(BlockOfClassesDto blockOfClassesDto) {
        BlockOfClasses blockOfClasses = new BlockOfClasses();
        blockOfClasses.setBlockName(blockOfClassesDto.getBlockName());
        blockOfClasses.setClasses(blockOfClassesDto.getClassesDto().stream().map(ClassesMapper::toClasses).toList());
      //  blockOfClasses.setCourse(CourseMapper.toCourse(blockOfClassesDto.getCourseDto()));
        return blockOfClasses;
    }

    public static BlockOfClassesDto toBlockOfClassesDto(BlockOfClasses blockOfClasses) {
        BlockOfClassesDto blockOfClassesDto = new BlockOfClassesDto();
        blockOfClassesDto.setBlockName(blockOfClasses.getBlockName());
        blockOfClassesDto.setClassesDto(blockOfClasses.getClasses().stream().map(ClassesMapper::toClassesDto).toList());
     //  blockOfClassesDto.setCourseDto(CourseMapper.toCourseDto(blockOfClasses.getCourse()));
        return blockOfClassesDto;
    }

}
