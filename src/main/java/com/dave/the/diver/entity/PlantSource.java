package com.dave.the.diver.entity;

import com.dave.the.diver.dto.PlantDto;
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
        PlantDto.PlantSourceDto plantSourceDto
    ) {
        this.plantSourceId = plantSourceDto.getPlantSourceId();
        this.name = plantSourceDto.getName();
        this.color = plantSourceDto.getColor();
    }

    public void updatePlantSource(
        PlantDto.PlantSourceDto plantSourceDto
    ) {
        this.name = plantSourceDto.getName();
        this.color = plantSourceDto.getColor();
    }
}
