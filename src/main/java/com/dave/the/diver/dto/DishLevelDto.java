package com.dave.the.diver.dto;

import com.dave.the.diver.entity.DishLevel;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DishLevelDto {
    private final String dishLevelId;

    private final String dishId;

    private final int dishLevel;

    public DishLevelDto(
        DishLevel dishLevel
    ) {
        this.dishLevelId = dishLevel.getDishLevelId();
        this.dishId = dishLevel.getDish().getDishId();
        this.dishLevel = dishLevel.getDishLevel();
    }
}
