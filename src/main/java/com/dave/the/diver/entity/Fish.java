package com.dave.the.diver.entity;

import com.dave.the.diver.constant.Data;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "dtd_fish")
@NoArgsConstructor
public class Fish {

    @Id
    @Column(name = "fish_id", nullable = false, length = 50)
    private String fishId;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "region_id")
    private Region region;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "time_id")
    private Time time;

    public Fish(
        Data.FishInfo fishInfo,
        Region region,
        Time time
    ) {
        this.fishId = fishInfo.getFishId();
        this.name = fishInfo.getName();
        this.region = region;
        this.time = time;
    }

    public void updateFish(
        Data.FishInfo fishInfo,
        Region region,
        Time time
    ) {
        this.name = fishInfo.getName();
        this.region = region;
        this.time = time;
    }
}