package com.dave.the.diver.entity;

import com.dave.the.diver.constant.Data;
import com.dave.the.diver.dto.DishDto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.List;

@Entity
@Getter
@Table(name = "dtd_dish")
@NoArgsConstructor
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

    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "unlock_id")
    private Unlock unlock;

    @OneToMany(mappedBy = "dish",
        fetch = FetchType.EAGER
    )
    @Fetch(value = FetchMode.SUBSELECT)
    private List<DishPartyRelation> dishPartyRelationList;

    public Dish(
        DishDto dishDto,
        Unlock unlock
    ) {
        this.dishId = dishDto.getDishId();
        this.name = dishDto.getName();
        this.maxCost = dishDto.getMaxCost();
        this.maxScore = dishDto.getMaxScore();
        this.maxCount = dishDto.getMaxCount();
        this.maxLevel = dishDto.getMaxLevel();
        this.flame = dishDto.getFlame();
        this.unlock = unlock;
    }

    public void updateDish(
        DishDto dishDto,
        Unlock unlock
    ) {
        this.name = dishDto.getName();
        this.maxCost = dishDto.getMaxCost();
        this.maxScore = dishDto.getMaxScore();
        this.maxCount = dishDto.getMaxCount();
        this.maxLevel = dishDto.getMaxLevel();
        this.flame = dishDto.getFlame();
        this.unlock = unlock;
    }
}
