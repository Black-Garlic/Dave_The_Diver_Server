package com.dave.the.diver.service;

import com.dave.the.diver.dto.FishDto;
import com.dave.the.diver.entity.Dish;
import com.dave.the.diver.entity.Fish;
import com.dave.the.diver.entity.Recipe;
import com.dave.the.diver.mapper.FishMapper;
import com.dave.the.diver.repository.DishRepository;
import com.dave.the.diver.repository.FishRepository;
import com.dave.the.diver.repository.RecipeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FishService {

    private final FishRepository fishRepository;
    private final DishRepository dishRepository;
    private final RecipeRepository recipeRepository;

    private final FishMapper fishMapper;

    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public List<FishDto> getFishList() {
        List<Fish> fishList = fishRepository.findAll();
        List<Dish> dishList = dishRepository.findByRecipeList_Type(Recipe.Type.FISH);

        return fishMapper.convertFishListToFishDtoList(fishList, dishList);
    }
}
