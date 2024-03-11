package com.dave.the.diver.mapper;

import com.dave.the.diver.dto.FishDto;
import com.dave.the.diver.entity.Fish;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FishMapper {

    public List<FishDto> convertFishListToFishDtoList(
        List<Fish> fishList
    ) {
        return fishList.stream()
            .map(this::convertFishToFishDto)
            .collect(Collectors.toList());
    }

    public FishDto convertFishToFishDto(
        Fish fish
    ) {
        return new FishDto(fish);
    }
}
