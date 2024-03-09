package com.dave.the.diver.service;

import com.dave.the.diver.dto.DishDto;
import com.dave.the.diver.entity.DishLevel;
import com.dave.the.diver.entity.Profile;
import com.dave.the.diver.mapper.DishMapper;
import com.dave.the.diver.repository.DishLevelRepository;
import com.dave.the.diver.repository.ProfileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DishService {

    private final DishLevelRepository dishLevelRepository;
    private final ProfileRepository profileRepository;

    private final DishMapper dishMapper;

    public List<DishDto.DishLevel> getDishLevelListByProfileId(
        String profileId
    ) {
        Profile profile = profileRepository.findById(profileId).orElseThrow();

        List<DishLevel> dishLevelList = dishLevelRepository.findByProfile(profile);

        return dishMapper.convertDishLevelListToDishLevelDtoList(dishLevelList);
    }
}
