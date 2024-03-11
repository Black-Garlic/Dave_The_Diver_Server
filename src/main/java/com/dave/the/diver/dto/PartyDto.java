package com.dave.the.diver.dto;

import com.dave.the.diver.entity.Party;
import lombok.Getter;

@Getter
public class PartyDto {

    private final String partyId;
    private final String name;

    public PartyDto(
        Party party
    ) {
        this.partyId = party.getPartyId();
        this.name = party.getName();
    }
}
