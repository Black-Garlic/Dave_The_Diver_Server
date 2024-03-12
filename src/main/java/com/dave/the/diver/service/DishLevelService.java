package com.dave.the.diver.service;

import com.dave.the.diver.dto.DishDto;
import com.dave.the.diver.dto.DishLevelDto;
import com.dave.the.diver.entity.DishLevel;
import com.dave.the.diver.entity.Profile;
import com.dave.the.diver.mapper.DishLevelMapper;
import com.dave.the.diver.repository.DishLevelRepository;
import com.dave.the.diver.repository.ProfileRepository;
import com.dave.the.diver.vm.DishVM;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DishLevelService {

    private final DishLevelRepository dishLevelRepository;
    private final ProfileRepository profileRepository;

    private final DishLevelMapper dishLevelMapper;

    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public List<DishLevelDto> getDishLevelListByProfileId(
        DishVM.DishLevelList dishVM
    ) {
        Profile profile = profileRepository.findById(dishVM.getProfileId()).orElseThrow();

        List<DishLevel> dishLevelList = dishLevelRepository.findByProfile(profile);

        return dishLevelMapper.convertDishLevelListToDishLevelDtoList(dishLevelList);
    }
}
