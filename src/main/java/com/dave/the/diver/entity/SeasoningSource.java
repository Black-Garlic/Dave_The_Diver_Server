package com.dave.the.diver.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "dtd_seasoning_source")
@NoArgsConstructor
public class SeasoningSource {

    @Id
    @Column(name = "seasoning_source_id", nullable = false, length = 50)
    private String seasoningSourceId;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "color", length = 20)
    private String color;

    public SeasoningSource(
        String seasoningSourceId,
        String name,
        String color
    ) {
        this.seasoningSourceId = seasoningSourceId;
        this.name = name;
        this.color = color;
    }

    public void updateSeasoningSource(
        String name,
        String color
    ) {
        this.name = name;
        this.color = color;
    }
}
