package com.dave.the.diver.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Getter
@Table(name = "dtd_plant_source_relation")
@NoArgsConstructor
public class PlantSourceRelation {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "plant_source_relation_id", nullable = false, length = 50)
    private String plantSourceRelationId;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "plant_id")
    private Plant plant;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "source_id")
    private Source source;

    public PlantSourceRelation(
        Plant plant,
        Source source
    ) {
        this.plant = plant;
        this.source = source;
    }
}
