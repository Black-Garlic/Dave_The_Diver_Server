package com.dave.the.diver.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Getter
@Table(name = "dtd_plant_plant_source_relation")
@NoArgsConstructor
public class PlantPlantSourceRelation {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "plant_plant_source_relation_id", nullable = false, length = 50)
    private String plantPlantSourceRelationId;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "plant_id")
    private Plant plant;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "plant_source_id")
    private PlantSource plantSource;

    public PlantPlantSourceRelation(
        Plant plant,
        PlantSource plantSource
    ) {
        this.plant = plant;
        this.plantSource = plantSource;
    }
}
