package com.dave.the.diver.repository;

import com.dave.the.diver.entity.Dish;
import com.dave.the.diver.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, String> {
    Optional<Recipe> findByDishAndIngredientId(Dish dish, String ingredientId);
}
