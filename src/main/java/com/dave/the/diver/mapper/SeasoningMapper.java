package com.dave.the.diver.mapper;

import com.dave.the.diver.dto.DishDto;
import com.dave.the.diver.dto.SeasoningDto;
import com.dave.the.diver.entity.Dish;
import com.dave.the.diver.entity.Seasoning;
import com.dave.the.diver.service.DishService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SeasoningMapper {

    private final DishService dishService;

    private final DishMapper dishMapper;

    public List<SeasoningDto> convertSeasoningListToSeasoningDtoList(
        List<Seasoning> seasoningList,
        List<Dish> dishList
    ) {
        return seasoningList.stream()
            .map(seasoning -> this.convertSeasoningToSeasoningDto(seasoning, dishList))
            .collect(Collectors.toList());
    }

    public SeasoningDto convertSeasoningToSeasoningDto(
        Seasoning seasoning,
        List<Dish> dishList
    ) {
        List<Dish> targetDishList = dishService.getDishListByRecipe(seasoning.getSeasoningId(), dishList);
        List<DishDto> targetDishDtoList = dishMapper.convertDishListToDishDtoList(targetDishList);

        return new SeasoningDto(seasoning, targetDishDtoList);
    }
}
