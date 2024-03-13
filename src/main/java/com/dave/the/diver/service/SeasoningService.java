package com.dave.the.diver.service;

import com.dave.the.diver.dto.SeasoningDto;
import com.dave.the.diver.entity.Dish;
import com.dave.the.diver.entity.Recipe;
import com.dave.the.diver.entity.Seasoning;
import com.dave.the.diver.mapper.SeasoningMapper;
import com.dave.the.diver.repository.DishRepository;
import com.dave.the.diver.repository.SeasoningRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SeasoningService {

    private final SeasoningRepository seasoningRepository;
    private final DishRepository dishRepository;

    private final SeasoningMapper seasoningMapper;

    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public List<SeasoningDto> getSeasoningList() {
        List<Seasoning> seasoningList = seasoningRepository.findAll();
        List<Dish> dishList = dishRepository.findByRecipeList_Type(Recipe.Type.SEASONING);

        return seasoningMapper.convertSeasoningListToSeasoningDtoList(seasoningList, dishList);
    }
}
