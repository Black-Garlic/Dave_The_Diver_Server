package com.dave.the.diver.service;

import com.dave.the.diver.dto.PlantDto;
import com.dave.the.diver.entity.Plant;
import com.dave.the.diver.mapper.PlantMapper;
import com.dave.the.diver.repository.PlantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlantService {

    private final PlantRepository plantRepository;

    private final PlantMapper plantMapper;

    public List<PlantDto> getPlantList() {
        List<Plant> plantList = plantRepository.findAll();

        return plantMapper.convertPlantListToPlantDtoList(plantList);
    }
}
