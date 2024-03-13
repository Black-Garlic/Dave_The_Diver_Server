package com.dave.the.diver.service;

import com.dave.the.diver.dto.DishDto;
import com.dave.the.diver.dto.DishLevelDto;
import com.dave.the.diver.entity.Dish;
import com.dave.the.diver.entity.DishLevel;
import com.dave.the.diver.entity.Profile;
import com.dave.the.diver.mapper.DishLevelMapper;
import com.dave.the.diver.repository.DishLevelRepository;
import com.dave.the.diver.repository.DishRepository;
import com.dave.the.diver.repository.ProfileRepository;
import com.dave.the.diver.vm.DishVM;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DishLevelService {

    private final DishLevelRepository dishLevelRepository;
    private final DishRepository dishRepository;
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

    @Transactional
    public void updateDishLevel(
        DishVM.Update dishVM
    ) {
        Dish dish = dishRepository.findById(dishVM.getDishId()).orElseThrow();
        Profile profile = profileRepository.findById(dishVM.getProfileId()).orElseThrow();
        DishLevelDto dishLevelDto = new DishLevelDto(dishVM);

        DishLevel dishLevel;

        Optional<DishLevel> dishLevelOptional = dishLevelRepository.findByDishAndProfile(dish, profile);

        if (dishLevelOptional.isEmpty()) {
            dishLevel = new DishLevel(dishLevelDto, dish, profile);
        } else {
            dishLevel = dishLevelOptional.get();
            dishLevel.updateDishLevel(dishLevelDto);
        }

        dishLevelRepository.save(dishLevel);
    }
}
