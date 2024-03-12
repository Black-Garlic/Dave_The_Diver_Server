package com.dave.the.diver.entity;

import com.dave.the.diver.constant.Data;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "dtd_plant")
@NoArgsConstructor
public class Plant {

    @Id
    @Column(name = "plant_id", nullable = false, length = 50)
    private String plantId;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "rank", nullable = false)
    private int rank;

    public Plant(
        Data.PlantInfo plantInfo
    ) {
        this.plantId = plantInfo.getPlantId();
        this.name = plantInfo.getName();
        this.rank = plantInfo.getRank();
    }

    public void updatePlant(
        Data.PlantInfo plantInfo
    ) {
        this.name = plantInfo.getName();
        this.rank = plantInfo.getRank();
    }
}
