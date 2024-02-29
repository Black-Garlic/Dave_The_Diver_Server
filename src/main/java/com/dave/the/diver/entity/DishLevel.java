package com.dave.the.diver.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Getter
@Table(name = "dish_level")
public class DishLevel {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "dish_level_id", columnDefinition = "VARCHAR(50)", nullable = false, length = 50)
    private String dishLevelId;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "profile_id")
    private Profile profile;

    private int level;
}
