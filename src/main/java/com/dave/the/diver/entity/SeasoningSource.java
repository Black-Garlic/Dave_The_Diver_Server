package com.dave.the.diver.entity;

import com.dave.the.diver.dto.SeasoningDto;
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
        SeasoningDto.SeasoningSourceDto seasoningSourceDto
    ) {
        this.seasoningSourceId = seasoningSourceDto.getSeasoningSourceId();
        this.name = seasoningSourceDto.getName();
        this.color = seasoningSourceDto.getColor();
    }

    public void updateSeasoningSource(
        SeasoningDto.SeasoningSourceDto seasoningSourceDto
    ) {
        this.name = seasoningSourceDto.getName();
        this.color = seasoningSourceDto.getColor();
    }
}
