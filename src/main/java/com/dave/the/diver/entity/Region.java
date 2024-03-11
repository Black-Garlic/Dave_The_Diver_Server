package com.dave.the.diver.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "dtd_region")
@NoArgsConstructor
public class Region {

    @Id
    @Column(name = "region_id", nullable = false, length = 50)
    private String regionId;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "color", length = 20)
    private String color;

    public Region(
        String regionId,
        String name,
        String color
    ) {
        this.regionId = regionId;
        this.name = name;
        this.color = color;
    }

    public void updateRegion(
        String name,
        String color
    ) {
        this.name = name;
        this.color = color;
    }
}
