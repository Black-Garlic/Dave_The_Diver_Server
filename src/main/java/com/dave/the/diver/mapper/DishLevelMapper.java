package com.dave.the.diver.mapper;

import com.dave.the.diver.dto.DishLevelDto;
import com.dave.the.diver.entity.DishLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DishLevelMapper {

    public List<DishLevelDto> convertDishLevelListToDishLevelDtoList(
        List<DishLevel> dishLevelList
    ) {
        return dishLevelList.stream()
            .map(this::convertDishLevelToDishLevelDto)
            .toList();
    }

    public DishLevelDto convertDishLevelToDishLevelDto(
        DishLevel dishLevel
    ) {
        return new DishLevelDto(dishLevel);
    }
}
