package com.example.coursemanagementsystem.service;

import com.example.coursemanagementsystem.dto.BlockOfClassesDto;
import com.example.coursemanagementsystem.model.BlockOfClasses;
import com.example.coursemanagementsystem.repository.BlockOfClassesRepository;
import com.example.coursemanagementsystem.util.mapper.BlockOfClassesMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BlockOfClassesService {

    private final BlockOfClassesRepository blockOfClassesRepository;

    public List<BlockOfClasses> getAllBlockOfClasses() {
        return blockOfClassesRepository.findAll();
    }
    public BlockOfClassesDto addBlockOfClasses(BlockOfClassesDto blockOfClassesDto) {
        BlockOfClasses blockOfClasses = BlockOfClassesMapper.toBlockOfClasses(blockOfClassesDto);
        BlockOfClasses addedBlockOfClasses = blockOfClassesRepository.save(blockOfClasses);
        return BlockOfClassesMapper.toBlockOfClassesDto(addedBlockOfClasses);
    }
}
