package com.dave.the.diver.dto;

import com.dave.the.diver.entity.Dish;
import com.dave.the.diver.entity.Party;
import com.dave.the.diver.entity.Unlock;
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
public class DishDto {

    private String dishId;
    private String name;
    private int maxCost = 0;
    private int maxScore = 0;
    private int maxCount = 1;
    private int maxLevel = 1;
    private int flame = 0;
    private UnlockDto unlockDto;
    private String unlock;
    private List<PartyDto> partyDtoList;
    private List<String> partyList;
    private List<RecipeDto> recipeDtoList;
    private int rank = 1;

    public DishDto(
        Dish dish
    ) {
        this.dishId = dish.getDishId();
        this.name = dish.getName();
        this.maxCost = dish.getMaxCost();
        this.maxScore = dish.getMaxScore();
        this.maxCount = dish.getMaxCount();
        this.maxLevel = dish.getMaxLevel();
        this.flame = dish.getFlame();

        if (dish.getUnlock() != null) {
            this.unlockDto = new UnlockDto(dish.getUnlock());
        }

        this.partyDtoList = dish.getDishPartyRelationList().stream()
            .map(dishPartyRelation -> new PartyDto(dishPartyRelation.getParty()))
            .collect(Collectors.toList());
    }

    public DishDto(
        String json
    ) throws JSONException {
        JSONObject jsonObject = new JSONObject(json);

        if (jsonObject.has("id")) {
            this.dishId = (String) jsonObject.get("id");
        }

        if (jsonObject.has("name")) {
            this.name = (String) jsonObject.get("name");
        }

        if (jsonObject.has("unlock")) {
            this.unlock = (String) jsonObject.get("unlock");
        }

        if (jsonObject.has("maxCost")) {
            this.maxCost = (int) jsonObject.get("maxCost");
        }

        if (jsonObject.has("maxScore")) {
            this.maxScore = (int) jsonObject.get("maxScore");
        }

        if (jsonObject.has("maxCount")) {
            this.maxCount = (int) jsonObject.get("maxCount");
        }

        if (jsonObject.has("maxLevel")) {
            this.maxLevel = (int) jsonObject.get("maxLevel");
        }

        if (jsonObject.has("flame")) {
            this.flame = (int) jsonObject.get("flame");
        }

        this.partyList = new ArrayList<>();

        if (jsonObject.has("party")) {
            JSONArray partyJsonArray = (JSONArray) jsonObject.get("party");

            for (int i = 0; i < partyJsonArray.length(); i++) {
                partyList.add((String) partyJsonArray.get(i));
            }
        }
    }

    public void setRecipeDtoList(List<RecipeDto> recipeDtoList) {
        this.recipeDtoList = recipeDtoList;

        int highestRank = 1;

        for (RecipeDto recipeDto : recipeDtoList) {
            highestRank = Math.max(recipeDto.getIngredientDto().getRank(), highestRank);
        }

        this.rank = highestRank;
    }

    @Getter
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class PartyDto {

        private final String partyId;
        private final String name;
        private final String color;

        public PartyDto(
            Party party
        ) {
            this.partyId = party.getPartyId();
            this.name = party.getName();
            this.color = party.getColor();
        }

        public PartyDto(
            String partyId,
            String name,
            String color
        ) {
            this.partyId = partyId;
            this.name = name;
            this.color = color;
        }
    }

    @Getter
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class UnlockDto {

        private final String unlockId;
        private final String name;

        public UnlockDto(
            Unlock unlock
        ) {
            this.unlockId = unlock.getUnlockId();
            this.name = unlock.getName();
        }

        public UnlockDto(
            String unlockId,
            String name
        ) {
            this.unlockId = unlockId;
            this.name = name;
        }
    }
}
