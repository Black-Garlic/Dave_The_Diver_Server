package com.dave.the.diver.service;

import com.dave.the.diver.dto.PlantDto;
import com.dave.the.diver.entity.Dish;
import com.dave.the.diver.entity.Plant;
import com.dave.the.diver.entity.Recipe;
import com.dave.the.diver.mapper.PlantMapper;
import com.dave.the.diver.repository.DishRepository;
import com.dave.the.diver.repository.PlantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlantService {

    private final PlantRepository plantRepository;
    private final DishRepository dishRepository;

    private final PlantMapper plantMapper;

    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public List<PlantDto> getPlantList() {
        List<Plant> plantList = plantRepository.findAll();
        List<Dish> dishList = dishRepository.findByRecipeList_Type(Recipe.Type.PLANT);

        return plantMapper.convertPlantListToPlantDtoList(plantList, dishList);
    }
}
