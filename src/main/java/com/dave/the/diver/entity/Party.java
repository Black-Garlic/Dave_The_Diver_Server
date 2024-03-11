package com.dave.the.diver.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "dtd_party")
@NoArgsConstructor
public class Party {

    @Id
    @Column(name = "party_id", nullable = false, length = 50)
    private String partyId;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "color", length = 20)
    private String color;

    public Party(
        String partyId,
        String name,
        String color
    ) {
        this.partyId = partyId;
        this.name = name;
        this.color = color;
    }

    public void updateParty(
        String name,
        String color
    ) {
        this.name = name;
        this.color = color;
    }
}
