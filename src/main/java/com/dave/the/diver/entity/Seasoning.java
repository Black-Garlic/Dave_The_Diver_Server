package com.dave.the.diver.entity;

import com.dave.the.diver.constant.Data;
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
        Data.SeasoningInfo seasoningInfo
    ) {
        this.seasoningId = seasoningInfo.getSeasoningId();
        this.name = seasoningInfo.getName();
        this.rank = seasoningInfo.getRank();
    }

    public void updateSeasoning(
        Data.SeasoningInfo seasoningInfo
    ) {
        this.name = seasoningInfo.getName();
        this.rank = seasoningInfo.getRank();
    }
}
