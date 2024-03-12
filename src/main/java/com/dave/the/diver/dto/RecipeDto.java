package com.dave.the.diver.dto;

import com.dave.the.diver.entity.Fish;
import com.dave.the.diver.entity.Plant;
import com.dave.the.diver.entity.Recipe;
import com.dave.the.diver.entity.Seasoning;
import lombok.Getter;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;

@Getter
public class RecipeDto {

    private String recipeId;
    private String dishId;
    private Recipe.Type type;
    private int count;
    private IngredientDto ingredientDto;
    private String ingredientId;

    public void commonConstructor(
        Recipe recipe
    ) {
        this.recipeId = recipe.getRecipeId();
        this.dishId = recipe.getDish().getDishId();
        this.type = recipe.getType();
        this.count = recipe.getCount();
    }

    public RecipeDto(
        Recipe recipe,
        Fish fish
    ) {
        this.commonConstructor(recipe);
        this.ingredientDto = new IngredientDto(fish);
    }

    public RecipeDto(
        Recipe recipe,
        Plant plant
    ) {
        this.commonConstructor(recipe);
        this.ingredientDto = new IngredientDto(plant);
    }

    public RecipeDto(
        Recipe recipe,
        Seasoning seasoning
    ) {
        this.commonConstructor(recipe);
        this.ingredientDto = new IngredientDto(seasoning);
    }

    public RecipeDto(
        String json
    ) throws JSONException {
        JSONObject jsonObject = new JSONObject(json);

        if (jsonObject.has("dishId")) {
            this.dishId = (String) jsonObject.get("dishId");
        }

        if (jsonObject.has("type")) {
            String typeString = (String) jsonObject.get("type");

            switch (typeString) {
                case "해산물":
                    this.type = Recipe.Type.FISH;
                    break;
                case "부재료":
                    this.type = Recipe.Type.PLANT;
                    break;
                case "조미료":
                    this.type = Recipe.Type.SEASONING;
                    break;
            }
        }

        if (jsonObject.has("count")) {
            this.count = (int) jsonObject.get("count");
        }

        if (jsonObject.has("ingredientId")) {
            this.ingredientId = (String) jsonObject.get("ingredientId");
        }
    }

    public static class IngredientDto {
        private final String ingredientId;
        private final String name;
        private final int rank;

        public IngredientDto(
            Fish fish
        ) {
            this.ingredientId = fish.getFishId();
            this.name = fish.getName();
            this.rank = fish.getRank();
        }

        public IngredientDto(
            Plant plant
        ) {
            this.ingredientId = plant.getPlantId();
            this.name = plant.getName();
            this.rank = plant.getRank();
        }

        public IngredientDto(
            Seasoning seasoning
        ) {
            this.ingredientId = seasoning.getSeasoningId();
            this.name = seasoning.getName();
            this.rank = seasoning.getRank();
        }
    }
}
