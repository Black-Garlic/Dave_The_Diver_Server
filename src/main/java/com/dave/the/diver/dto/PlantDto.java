package com.dave.the.diver.dto;

import lombok.Getter;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

@Getter
public class PlantDto {

    private String plantId;
    private String name;
    private int rank;
    private final List<String> plantSourceList;

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

        this.plantSourceList = new ArrayList<>();

        if (jsonObject.has("source")) {
            JSONArray plantSourceJsonArray = (JSONArray) jsonObject.get("source");

            for (int i = 0; i < plantSourceJsonArray.length(); i++) {
                plantSourceList.add((String) plantSourceJsonArray.get(i));
            }
        }
    }
}
