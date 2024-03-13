package com.dave.the.diver.dto;

import com.dave.the.diver.entity.Source;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SourceDto {

    private final String sourceId;
    private final String name;
    private final String color;

    public SourceDto(
        Source source
    ) {
        this.sourceId = source.getSourceId();
        this.name = source.getName();
        this.color = source.getColor();
    }

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
