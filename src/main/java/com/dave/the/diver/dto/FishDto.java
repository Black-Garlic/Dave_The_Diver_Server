package com.dave.the.diver.dto;

import com.dave.the.diver.entity.Fish;
import lombok.Getter;

@Getter
public class FishDto {

    private final String fishId;
    private final String name;
    private final String region;
    private final String time;

    public FishDto(
        Fish fish
    ) {
        this.fishId = fish.getFishId();
        this.name = fish.getName();
        this.region = fish.getRegion().getName();
        this.time = fish.getTime().getName();
    }
}
