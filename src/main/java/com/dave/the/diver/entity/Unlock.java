package com.dave.the.diver.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Getter
@Table(name = "dtd_unlock")
public class Unlock {

    @Id
    @Column(name = "unlock_Id", nullable = false, length = 50)
    private String unlockId;

    @Column(name = "name", nullable = false, length = 50)
    private String name;
}
