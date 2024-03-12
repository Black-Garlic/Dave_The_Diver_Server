package com.dave.the.diver.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Getter
@Table(name = "dtd_seasoning_source_relation")
@NoArgsConstructor
public class SeasoningSourceRelation {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "seasoning_source_relation_id", nullable = false, length = 50)
    private String seasoningSourceRelationId;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "seasoning_id")
    private Seasoning seasoning;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "source_id")
    private Source source;

    public SeasoningSourceRelation(
        Seasoning seasoning,
        Source source
    ) {
        this.seasoning = seasoning;
        this.source = source;
    }
}
