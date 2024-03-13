package com.dave.the.diver.repository;

import com.dave.the.diver.entity.Dish;
import com.dave.the.diver.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DishRepository extends JpaRepository<Dish, String> {
    List<Dish> findByRecipeList_Type(Recipe.Type type);
}
