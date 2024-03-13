package com.dave.the.diver.entity;

import com.dave.the.diver.dto.PlantDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.List;

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

    @Column(name = "plant_rank", nullable = false)
    private int rank;

    @OneToMany(mappedBy = "plant",
        fetch = FetchType.EAGER
    )
    @Fetch(value = FetchMode.SUBSELECT)
    private List<PlantSourceRelation> plantSourceRelationList;

    public Plant(
        PlantDto plantDto
    ) {
        this.plantId = plantDto.getPlantId();
        this.name = plantDto.getName();
        this.rank = plantDto.getRank();
    }

    public void updatePlant(
        PlantDto plantDto
    ) {
        this.name = plantDto.getName();
        this.rank = plantDto.getRank();
    }
}
