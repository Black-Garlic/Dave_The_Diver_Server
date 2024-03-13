package com.dave.the.diver.dto;

import com.dave.the.diver.entity.DishLevel;
import com.dave.the.diver.vm.DishVM;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DishLevelDto {

    private String dishLevelId;

    private String dishId;

    private int dishLevel;

    public DishLevelDto(
        DishLevel dishLevel
    ) {
        this.dishLevelId = dishLevel.getDishLevelId();
        this.dishId = dishLevel.getDish().getDishId();
        this.dishLevel = dishLevel.getDishLevel();
    }

    public DishLevelDto(
        DishVM.Update dishVM
    ) {
        this.dishId = dishVM.getDishId();
        this.dishLevel = dishVM.getDishLevel();
    }

    public DishLevelDto(
        String json
    ) throws JSONException {
        JSONObject jsonObject = new JSONObject(json);

        if (jsonObject.has("dishId")) {
            this.dishId = (String) jsonObject.get("dishId");
        }

        if (jsonObject.has("dishLevel")) {
            this.dishLevel = (int) jsonObject.get("dishLevel");
        }
    }
}
