package com.dave.the.diver.service;

import com.dave.the.diver.dto.DishDto;
import com.dave.the.diver.entity.Dish;
import com.dave.the.diver.entity.Recipe;
import com.dave.the.diver.mapper.DishMapper;
import com.dave.the.diver.repository.DishRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DishService {

    private final DishRepository dishRepository;

    private final DishMapper dishMapper;

    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public List<DishDto> getDishList() {
        List<Dish> dishList = dishRepository.findAll();

        return dishMapper.convertDishListToDishDtoList(dishList);
    }

    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public DishDto getDishDetail(
        String dishId
    ) {
        Dish dish = dishRepository.findById(dishId).orElseThrow();

        return dishMapper.convertDishToDishDtoWithRecipe(dish);
    }

    public List<Dish> getDishListByRecipe(
        String ingredientId,
        List<Dish> dishList
    ) {
        List<Dish> targetDishList = new ArrayList<>();

        for (Dish dish : dishList) {
            for (Recipe recipe : dish.getRecipeList()) {
                if (recipe.getIngredientId().equals(ingredientId)) {
                    targetDishList.add(recipe.getDish());
                    break;
                }
            }
        }

        return targetDishList;
    }
}
