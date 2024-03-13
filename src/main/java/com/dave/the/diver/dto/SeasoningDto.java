package com.dave.the.diver.dto;

import com.dave.the.diver.entity.Dish;
import com.dave.the.diver.entity.Seasoning;
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
public class SeasoningDto {

    private String seasoningId;
    private String name;
    private int rank;
    private List<SourceDto> sourceDtoList;
    private List<String> seasoningSourceList;
    private List<DishDto> dishDtoList;

    public SeasoningDto(
        Seasoning seasoning,
        List<DishDto> dishDtoList
    ) {
        this.seasoningId = seasoning.getSeasoningId();
        this.name = seasoning.getName();
        this.rank = seasoning.getRank();
        this.sourceDtoList = seasoning.getSeasoningSourceRelationList().stream()
            .map(seasoningSourceRelation -> new SourceDto(seasoningSourceRelation.getSource()))
            .collect(Collectors.toList());
        this.dishDtoList = dishDtoList;
    }

    public SeasoningDto(
        String json
    ) throws JSONException {
        JSONObject jsonObject = new JSONObject(json);

        if (jsonObject.has("id")) {
            this.seasoningId = (String) jsonObject.get("id");
        }

        if (jsonObject.has("name")) {
            this.name = (String) jsonObject.get("name");
        }

        if (jsonObject.has("rank")) {
            this.rank = (int) jsonObject.get("rank");
        }

        this.seasoningSourceList = new ArrayList<>();

        if (jsonObject.has("source")) {
            JSONArray plantSourceJsonArray = (JSONArray) jsonObject.get("source");

            for (int i = 0; i < plantSourceJsonArray.length(); i++) {
                seasoningSourceList.add((String) plantSourceJsonArray.get(i));
            }
        }
    }
}
