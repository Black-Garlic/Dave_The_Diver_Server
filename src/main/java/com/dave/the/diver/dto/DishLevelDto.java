package com.dave.the.diver.dto;

import lombok.Getter;

@Getter
public class DishLevelDto {
    private final String dishLevelId;

    private final DishDto dish;

    private final int dishLevel;

    public DishLevelDto(
        com.dave.the.diver.entity.DishLevel dishLevel
    ) {
        this.dishLevelId = dishLevel.getDishLevelId();
        this.dish = new DishDto(dishLevel.getDish());
        this.dishLevel = dishLevel.getDishLevel();
    }
}
