package com.dave.the.diver.mapper;

import com.dave.the.diver.dto.DishDto;
import com.dave.the.diver.entity.DishLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DishMapper {

    public List<DishDto.DishLevel> convertDishLevelListToDishLevelDtoList(
        List<DishLevel> dishLevelList
    ) {
        return dishLevelList.stream()
            .map(this::convertDishLevelToDishLevelDto)
            .toList();
    }

    public DishDto.DishLevel convertDishLevelToDishLevelDto(
        DishLevel dishLevel
    ) {
        return new DishDto.DishLevel(dishLevel);
    }
}
