package com.example.coursemanagementsystem.util.mapper;

import com.example.coursemanagementsystem.dto.BlockOfClassesDto;
import com.example.coursemanagementsystem.model.BlockOfClasses;

public class BlockOfClassesMapper {

    public static BlockOfClasses toBlockOfClasses(BlockOfClassesDto blockOfClassesDto) {
        BlockOfClasses blockOfClasses = new BlockOfClasses();
        blockOfClasses.setBlockName(blockOfClassesDto.getBlockName());
        blockOfClasses.setClasses(blockOfClassesDto.getClasses());
        blockOfClasses.setCourse(blockOfClassesDto.getCourse());
        return blockOfClasses;
    }

    public static BlockOfClassesDto toBlockOfClassesDto(BlockOfClasses blockOfClasses) {
        BlockOfClassesDto blockOfClassesDto = new BlockOfClassesDto();
        blockOfClassesDto.setBlockName(blockOfClasses.getBlockName());
        blockOfClassesDto.setClasses(blockOfClasses.getClasses());
        blockOfClassesDto.setCourse(blockOfClasses.getCourse());
        return blockOfClassesDto;
    }

}
