package com.dave.the.diver.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "dtd_plant_source")
@NoArgsConstructor
public class PlantSource {

    @Id
    @Column(name = "plant_source_id", nullable = false, length = 50)
    private String plantSourceId;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "color", length = 20)
    private String color;

    public PlantSource(
        String plantSourceId,
        String name,
        String color
    ) {
        this.plantSourceId = plantSourceId;
        this.name = name;
        this.color = color;
    }

    public void updatePlantSource(
        String name,
        String color
    ) {
        this.name = name;
        this.color = color;
    }
}
