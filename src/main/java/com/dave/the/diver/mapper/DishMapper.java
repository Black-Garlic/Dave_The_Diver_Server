package com.dave.the.diver.mapper;

import com.dave.the.diver.dto.DishDto;
import com.dave.the.diver.dto.RecipeDto;
import com.dave.the.diver.entity.*;
import com.dave.the.diver.repository.FishRepository;
import com.dave.the.diver.repository.PlantRepository;
import com.dave.the.diver.repository.SeasoningRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DishMapper {

    private final FishRepository fishRepository;
    private final PlantRepository plantRepository;
    private final SeasoningRepository seasoningRepository;

    public List<DishDto> convertDishListToDishDtoList(
        List<Dish> dishList
    ) {
        return dishList.stream()
            .map(this::convertDishToDishDto)
            .collect(Collectors.toList());
    }

    public DishDto convertDishToDishDto(
        Dish dish
    ) {
        return new DishDto(dish);
    }

    public DishDto convertDishToDishDtoWithRecipe(
        Dish dish
    ) {
        List<RecipeDto> recipeDtoList = this.getRecipeDtoList(dish.getRecipeList());

        DishDto dishDto = new DishDto(dish);
        dishDto.setRecipeDtoList(recipeDtoList);

        return dishDto;
    }

    public List<RecipeDto> getRecipeDtoList(
        List<Recipe> recipeList
    ) {
        return recipeList.stream()
            .map(this::getRecipeDto)
            .collect(Collectors.toList());
    }

    public RecipeDto getRecipeDto(
        Recipe recipe
    ) {
        switch (recipe.getType()) {
            case FISH:
                Fish fish = fishRepository.findById(recipe.getIngredientId()).orElse(null);
                return new RecipeDto(recipe, fish);
            case PLANT:
                Plant plant = plantRepository.findById(recipe.getIngredientId()).orElse(null);
                return new RecipeDto(recipe, plant);
            case SEASONING:
                Seasoning seasoning = seasoningRepository.findById(recipe.getIngredientId()).orElse(null);
                return new RecipeDto(recipe, seasoning);
            default:
                return null;
        }
    }
}
