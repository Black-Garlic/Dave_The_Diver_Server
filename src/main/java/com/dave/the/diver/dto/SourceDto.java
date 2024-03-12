package com.dave.the.diver.dto;

import lombok.Getter;

@Getter
public class SourceDto {

    private final String sourceId;
    private final String name;
    private final String color;

    public SourceDto(
        String sourceId,
        String name,
        String color
    ) {
        this.sourceId = sourceId;
        this.name = name;
        this.color = color;
    }
}
