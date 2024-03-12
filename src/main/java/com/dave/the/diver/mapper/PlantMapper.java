package com.dave.the.diver.mapper;

import com.dave.the.diver.dto.PlantDto;
import com.dave.the.diver.entity.Plant;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlantMapper {

    public List<PlantDto> convertPlantListToPlantDtoList(
        List<Plant> plantList
    ) {
        return plantList.stream()
            .map(this::convertPlantToPlantDto)
            .collect(Collectors.toList());
    }

    public PlantDto convertPlantToPlantDto(
        Plant plant
    ) {
        return new PlantDto(plant);
    }
}
