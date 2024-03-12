package com.dave.the.diver.dto;

import com.dave.the.diver.entity.Fish;
import com.dave.the.diver.entity.Region;
import com.dave.the.diver.entity.Time;
import lombok.Getter;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;

@Getter
public class FishDto {

    private String fishId;
    private String name;
    private int rank;
    private RegionDto regionDto;
    private String region;
    private TimeDto timeDto;
    private String time;

    public FishDto(
        Fish fish
    ) {
        this.fishId = fish.getFishId();
        this.name = fish.getName();
        this.rank = fish.getRank();
        this.regionDto = new RegionDto(fish.getRegion());
        this.timeDto = new TimeDto(fish.getTime());
    }

    public FishDto(
        String json
    ) throws JSONException {
        JSONObject jsonObject = new JSONObject(json);

        if (jsonObject.has("id")) {
            this.fishId = (String) jsonObject.get("id");
        }

        if (jsonObject.has("name")) {
            this.name = (String) jsonObject.get("name");
        }

        if (jsonObject.has("rank")) {
            this.rank = (int) jsonObject.get("rank");
        }

        if (jsonObject.has("region")) {
            this.region = (String) jsonObject.get("region");
        }

        if (jsonObject.has("time")) {
            this.time = (String) jsonObject.get("time");
        }
    }

    @Getter
    public static class RegionDto {

        private final String regionId;
        private final String name;
        private final String color;

        private RegionDto(
            Region region
        ) {
            this.regionId = region.getRegionId();
            this.name = region.getName();
            this.color = region.getColor();
        }

        public RegionDto(
            String regionId,
            String name,
            String color
        ) {
            this.regionId = regionId;
            this.name = name;
            this.color = color;
        }
    }

    @Getter
    public static class TimeDto {

        private final String timeId;
        private final String name;
        private final String color;

        public TimeDto(
            Time time
        ) {
            this.timeId = time.getTimeId();
            this.name = time.getName();
            this.color = time.getColor();
        }

        public TimeDto(
            String timeId,
            String name,
            String color
        ) {
            this.timeId = timeId;
            this.name = name;
            this.color = color;
        }
    }
}
