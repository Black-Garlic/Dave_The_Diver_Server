package com.dave.the.diver.mapper;

import com.dave.the.diver.dto.SeasoningDto;
import com.dave.the.diver.entity.Seasoning;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SeasoningMapper {

    public List<SeasoningDto> convertSeasoningListToSeasoningDtoList(
        List<Seasoning> seasoningList
    ) {
        return seasoningList.stream()
            .map(this::convertSeasoningToSeasoningDto)
            .collect(Collectors.toList());
    }

    public SeasoningDto convertSeasoningToSeasoningDto(
        Seasoning seasoning
    ) {
        return new SeasoningDto(seasoning);
    }
}
