package com.dave.the.diver.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Getter
@Table(name = "dish")
public class Dish {

    @Id
    @Column(name = "dish_id", nullable = false, length = 50)
    private String dishId;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "max_cost")
    private int maxCost = 0;

    @Column(name = "max_score")
    private int maxScore = 0;

    @Column(name = "max_count")
    private int maxCount = 1;

    @Column(name = "max_level")
    private int maxLevel = 1;

    @Column(name = "flame")
    private int flame = 0;
}
