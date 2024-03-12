package com.dave.the.diver.entity;

import com.dave.the.diver.constant.Data;
import com.dave.the.diver.dto.SeasoningDto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "dtd_seasoning")
@NoArgsConstructor
public class Seasoning {

    @Id
    @Column(name = "seasoning_id", nullable = false, length = 50)
    private String seasoningId;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "rank", nullable = false)
    private int rank;

    public Seasoning(
        SeasoningDto seasoningDto
    ) {
        this.seasoningId = seasoningDto.getSeasoningId();
        this.name = seasoningDto.getName();
        this.rank = seasoningDto.getRank();
    }

    public void updateSeasoning(
        SeasoningDto seasoningDto
    ) {
        this.name = seasoningDto.getName();
        this.rank = seasoningDto.getRank();
    }
}
