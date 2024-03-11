package com.dave.the.diver.entity;

import com.dave.the.diver.constant.Data;
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
        Data.DishInfo dishInfo,
        Unlock unlock
    ) {
        this.dishId = dishInfo.getDishId();
        this.name = dishInfo.getName();
        this.maxCost = dishInfo.getMaxCost();
        this.maxScore = dishInfo.getMaxScore();
        this.maxCount = dishInfo.getMaxCount();
        this.maxLevel = dishInfo.getMaxLevel();
        this.flame = dishInfo.getFlame();
        this.unlock = unlock;
    }
}
