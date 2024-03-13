package com.dave.the.diver.mapper;

import com.dave.the.diver.dto.FishDto;
import com.dave.the.diver.entity.Dish;
import com.dave.the.diver.entity.Fish;
import com.dave.the.diver.entity.Recipe;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FishMapper {

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
        List<Dish> targetDishList = new ArrayList<>();

        for (Dish dish : dishList) {
            for (Recipe recipe : dish.getRecipeList()) {
                if (recipe.getIngredientId().equals(fish.getFishId())) {
                    targetDishList.add(recipe.getDish());
                    break;
                }
            }
        }

        return new FishDto(fish, targetDishList);
    }
}
