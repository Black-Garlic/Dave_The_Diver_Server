package com.dave.the.diver.entity;

import com.dave.the.diver.dto.FishDto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "dtd_time")
@NoArgsConstructor
public class Time {

    @Id
    @Column(name = "time_id", nullable = false, length = 50)
    private String timeId;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "color", length = 20)
    private String color;

    public Time(
        FishDto.TimeDto timeDto
    ) {
        this.timeId = timeDto.getTimeId();
        this.name = timeDto.getName();
        this.color = timeDto.getColor();
    }

    public void updateTime(
        FishDto.TimeDto timeDto
    ) {
        this.name = timeDto.getName();
        this.color = timeDto.getColor();
    }
}
