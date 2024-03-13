package com.dave.the.diver.mapper;

import com.dave.the.diver.dto.FishDto;
import com.dave.the.diver.entity.Dish;
import com.dave.the.diver.entity.Fish;
import com.dave.the.diver.entity.Recipe;
import com.dave.the.diver.service.DishService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class FishMapper {

    private final DishService dishService;

    public List<FishDto> convertFishListToFishDtoList(
        List<Fish> fishList,
        List<Dish> dishList
    ) {
        return fishList.stream()
            .map(fish -> this.convertFishToFishDto(fish, dishList))
            .collect(Collectors.toList());
    }

    public FishDto convertFishToFishDto(
        Fish fish,
        List<Dish> dishList
    ) {
        List<Dish> targetDishList = dishService.getDishListByRecipe(fish.getFishId(), dishList);

        return new FishDto(fish, targetDishList);
    }
}
