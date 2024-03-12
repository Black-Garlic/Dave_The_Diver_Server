package com.dave.the.diver.entity;

import com.dave.the.diver.dto.SourceDto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "dtd_source")
@NoArgsConstructor
public class Source {

    @Id
    @Column(name = "source_id", nullable = false, length = 50)
    private String sourceId;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "color", length = 20)
    private String color;

    public Source(
        SourceDto sourceDto
    ) {
        this.sourceId = sourceDto.getSourceId();
        this.name = sourceDto.getName();
        this.color = sourceDto.getColor();
    }

    public void updateSource(
        SourceDto sourceDto
    ) {
        this.name = sourceDto.getName();
        this.color = sourceDto.getColor();
    }
}
