package com.dave.the.diver.dto;

import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
public class DishDto {

    private final String dishId;
    private final String name;
    private final int maxCost;
    private final int maxScore;
    private final int maxCount;
    private final int maxLevel;
    private final int flame;
    private final String unlock;
    private final List<PartyDto> partyDtoList;

    public DishDto(
        com.dave.the.diver.entity.Dish dish
    ) {
        this.dishId = dish.getDishId();
        this.name = dish.getName();
        this.maxCost = dish.getMaxCost();
        this.maxScore = dish.getMaxScore();
        this.maxCount = dish.getMaxCount();
        this.maxLevel = dish.getMaxLevel();
        this.flame = dish.getFlame();
        this.unlock = dish.getUnlock().getName();
        this.partyDtoList = dish.getDishPartyRelationList().stream()
            .map(dishPartyRelation -> new PartyDto(dishPartyRelation.getParty()))
            .collect(Collectors.toList());
    }
}
