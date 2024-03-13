package com.dave.the.diver.mapper;

import com.dave.the.diver.dto.PlantDto;
import com.dave.the.diver.entity.Dish;
import com.dave.the.diver.entity.Plant;
import com.dave.the.diver.service.DishService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PlantMapper {

    private final DishService dishService;

    public List<PlantDto> convertPlantListToPlantDtoList(
        List<Plant> plantList,
        List<Dish> dishList
    ) {
        return plantList.stream()
            .map(plant -> this.convertPlantToPlantDto(plant, dishList))
            .collect(Collectors.toList());
    }

    public PlantDto convertPlantToPlantDto(
        Plant plant,
        List<Dish> dishList
    ) {
        List<Dish> targetDishList = dishService.getDishListByRecipe(plant.getPlantId(), dishList);

        return new PlantDto(plant, targetDishList);
    }
}
