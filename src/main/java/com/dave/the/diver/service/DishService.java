package com.dave.the.diver.service;

import com.dave.the.diver.dto.DishDto;
import com.dave.the.diver.entity.Dish;
import com.dave.the.diver.mapper.DishMapper;
import com.dave.the.diver.repository.DishRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DishService {

    private final DishRepository dishRepository;

    private final DishMapper dishMapper;

    public List<DishDto> getDishList() {
        List<Dish> dishList = dishRepository.findAll();

        return dishMapper.convertDishListToDishDtoList(dishList);
    }

    public DishDto getDishDetail(
        String dishId
    ) {
        Dish dish = dishRepository.findById(dishId).orElseThrow();

        return dishMapper.convertDishToDishDtoWithRecipe(dish);
    }
}
