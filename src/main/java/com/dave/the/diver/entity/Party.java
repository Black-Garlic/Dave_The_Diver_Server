package com.dave.the.diver.entity;

import com.dave.the.diver.dto.DishDto;
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
        DishDto.PartyDto partyDto
    ) {
        this.partyId = partyDto.getPartyId();
        this.name = partyDto.getName();
        this.color = partyDto.getColor();
    }

    public void updateParty(
        DishDto.PartyDto partyDto
    ) {
        this.name = partyDto.getName();
        this.color = partyDto.getColor();
    }
}
