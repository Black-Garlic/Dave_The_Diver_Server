package com.dave.the.diver.mapper;

import com.dave.the.diver.dto.DishDto;
import com.dave.the.diver.entity.Dish;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DishMapper {

    public List<DishDto> convertDishListToDishDtoList(
        List<Dish> dishList
    ) {
        return dishList.stream()
            .map(this::convertDishToDishDtoList)
            .collect(Collectors.toList());
    }

    public DishDto convertDishToDishDtoList(
        Dish dish
    ) {
        return new DishDto(dish);
    }
}
