package com.dave.the.diver.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Getter
@Table(name = "dtd_party")
public class Party {

    @Id
    @Column(name = "party_id", nullable = false, length = 50)
    private String partyId;

    @Column(name = "name", nullable = false, length = 50)
    private String name;
}
