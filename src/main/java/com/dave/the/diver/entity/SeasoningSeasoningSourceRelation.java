package com.dave.the.diver.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Getter
@Table(name = "dtd_seasoning_seasoning_source_relation")
@NoArgsConstructor
public class SeasoningSeasoningSourceRelation {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "seasoning_seasoning_source_relation_id", nullable = false, length = 50)
    private String seasoningSeasoningSourceRelationId;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "seasoning_id")
    private Seasoning seasoning;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "seasoning_source_id")
    private SeasoningSource seasoningSource;

    public SeasoningSeasoningSourceRelation(
        Seasoning seasoning,
        SeasoningSource seasoningSource
    ) {
        this.seasoning = seasoning;
        this.seasoningSource = seasoningSource;
    }
}
