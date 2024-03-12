package com.dave.the.diver.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Getter
@Table(name = "dtd_dish_level")
@NoArgsConstructor
public class DishLevel {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "dish_level_id", nullable = false, length = 50)
    private String dishLevelId;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "dish_id")
    private Dish dish;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "profile_id")
    private Profile profile;

    @Column(name = "dish_level")
    private int dishLevel;

    public DishLevel(
        Dish dish,
        Profile profile,
        int dishLevel
    ) {
        this.dish = dish;
        this.profile = profile;
        this.dishLevel = dishLevel;
    }

    public void updateDishLevel(
        int dishLevel
    ) {
        this.dishLevel = dishLevel;
    }
}
