package com.dave.the.diver.dto;

import com.dave.the.diver.entity.DishLevel;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DishLevelDto {
    private final String dishLevelId;

    private final DishDto dish;

    private final int dishLevel;

    public DishLevelDto(
        DishLevel dishLevel
    ) {
        this.dishLevelId = dishLevel.getDishLevelId();
        this.dish = new DishDto(dishLevel.getDish());
        this.dishLevel = dishLevel.getDishLevel();
    }
}
