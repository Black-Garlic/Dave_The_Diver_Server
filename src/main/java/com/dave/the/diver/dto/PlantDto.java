package com.dave.the.diver.dto;

import com.dave.the.diver.entity.Plant;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PlantDto {

    private String plantId;
    private String name;
    private int rank;
    private List<SourceDto> sourceDtoList;
    private List<String> sourceList;
    private List<DishDto> dishDtoList;

    public PlantDto(
        Plant plant,
        List<DishDto> dishDtoList
    ) {
        this.plantId = plant.getPlantId();
        this.name = plant.getName();
        this.rank = plant.getRank();
        this.sourceDtoList = plant.getPlantSourceRelationList().stream()
            .map(plantSourceRelation -> new SourceDto(plantSourceRelation.getSource()))
            .collect(Collectors.toList());
        this.dishDtoList = dishDtoList;
    }

    public PlantDto(
        String json
    ) throws JSONException {
        JSONObject jsonObject = new JSONObject(json);

        if (jsonObject.has("id")) {
            this.plantId = (String) jsonObject.get("id");
        }

        if (jsonObject.has("name")) {
            this.name = (String) jsonObject.get("name");
        }

        if (jsonObject.has("rank")) {
            this.rank = (int) jsonObject.get("rank");
        }

        this.sourceList = new ArrayList<>();

        if (jsonObject.has("source")) {
            JSONArray plantSourceJsonArray = (JSONArray) jsonObject.get("source");

            for (int i = 0; i < plantSourceJsonArray.length(); i++) {
                sourceList.add((String) plantSourceJsonArray.get(i));
            }
        }
    }
}
