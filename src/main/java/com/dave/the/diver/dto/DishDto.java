package com.dave.the.diver.dto;

import com.dave.the.diver.entity.Dish;
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
    private String unlock;
    private final List<String> partyList;

    public DishDto(
        Dish dish
    ) {
        this.dishId = dish.getDishId();
        this.name = dish.getName();
        this.maxCost = dish.getMaxCost();
        this.maxScore = dish.getMaxScore();
        this.maxCount = dish.getMaxCount();
        this.maxLevel = dish.getMaxLevel();
        this.flame = dish.getFlame();

        if (dish.getUnlock() != null) {
            this.unlock = dish.getUnlock().getName();
        }

        this.partyList = dish.getDishPartyRelationList().stream()
            .map(dishPartyRelation -> new PartyDto(dishPartyRelation.getParty()).getName())
            .collect(Collectors.toList());
    }
}
