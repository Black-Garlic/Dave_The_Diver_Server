package com.dave.the.diver.dto;

import lombok.Getter;

public class DishDto {

    @Getter
    public static class Dish {
        private final String dishId;
        private final String name;
        private final int maxCost;
        private final int maxScore;
        private final int maxCount;
        private final int maxLevel;
        private final int flame;

        public Dish(
            com.dave.the.diver.entity.Dish dish
        ) {
            this.dishId = dish.getDishId();
            this.name = dish.getName();
            this.maxCost = dish.getMaxCost();
            this.maxScore = dish.getMaxScore();
            this.maxCount = dish.getMaxCount();
            this.maxLevel = dish.getMaxLevel();
            this.flame = dish.getFlame();
        }
    }

    @Getter
    public static class DishLevel {
        private final String dishLevelId;

        private final Dish dish;

        private final int level;

        public DishLevel(
            com.dave.the.diver.entity.DishLevel dishLevel
        ) {
            this.dishLevelId = dishLevel.getDishLevelId();
            this.dish = new Dish(dishLevel.getDish());
            this.level = dishLevel.getLevel();
        }
    }
}
