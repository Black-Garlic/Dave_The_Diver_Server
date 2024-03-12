package com.dave.the.diver.entity;

import com.dave.the.diver.dto.RecipeDto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Getter
@Table(name = "dtd_recipe")
@NoArgsConstructor
public class Recipe {

    public enum Type {
        FISH,
        PLANT,
        SEASONING
    }

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "recipe_id", nullable = false, length = 50)
    private String recipeId;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "dish_id")
    private Dish dish;

    @Column(name = "type")
    private Type type;

    @Column(name = "count")
    private int count = 1;

    @Column(name = "ingredient_id")
    private String ingredientId;

    public Recipe(
        RecipeDto recipeDto,
        Dish dish
    ) {
        this.dish = dish;
        this.type = recipeDto.getType();
        this.count = recipeDto.getCount();
        this.ingredientId = recipeDto.getIngredientId();
    }

    public void updateRecipe(
        RecipeDto recipeDto,
        Dish dish
    ) {
        this.dish = dish;
        this.type = recipeDto.getType();
        this.count = recipeDto.getCount();
        this.ingredientId = recipeDto.getIngredientId();
    }
}
