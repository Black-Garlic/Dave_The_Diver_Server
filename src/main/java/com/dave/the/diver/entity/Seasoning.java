package com.dave.the.diver.entity;

import com.dave.the.diver.dto.SeasoningDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.List;

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

    @Column(name = "seasoning_rank", nullable = false)
    private int rank;

    @OneToMany(mappedBy = "seasoning",
        fetch = FetchType.EAGER
    )
    @Fetch(value = FetchMode.SUBSELECT)
    private List<SeasoningSourceRelation> seasoningSourceRelationList;

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
