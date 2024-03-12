package com.dave.the.diver.service;

import com.dave.the.diver.dto.SeasoningDto;
import com.dave.the.diver.entity.Seasoning;
import com.dave.the.diver.mapper.SeasoningMapper;
import com.dave.the.diver.repository.SeasoningRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SeasoningService {

    private final SeasoningRepository seasoningRepository;

    private final SeasoningMapper seasoningMapper;

    public List<SeasoningDto> getSeasoningList() {
        List<Seasoning> seasoningList = seasoningRepository.findAll();

        return seasoningMapper.convertSeasoningListToSeasoningDtoList(seasoningList);
    }
}
