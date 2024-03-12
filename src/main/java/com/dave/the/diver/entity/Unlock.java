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
@Table(name = "dtd_unlock")
@NoArgsConstructor
public class Unlock {

    @Id
    @Column(name = "unlock_Id", nullable = false, length = 50)
    private String unlockId;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    public Unlock(
        DishDto.UnlockDto unlockDto
    ) {
        this.unlockId = unlockDto.getUnlockId();
        this.name = unlockDto.getName();
    }

    public void updateUnlock(
        DishDto.UnlockDto unlockDto
    ) {
        this.name = unlockDto.getName();
    }
}
