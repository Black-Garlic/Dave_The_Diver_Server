package com.dave.the.diver.service;

import com.dave.the.diver.dto.FishDto;
import com.dave.the.diver.entity.Fish;
import com.dave.the.diver.mapper.FishMapper;
import com.dave.the.diver.repository.FishRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FishService {

    private final FishRepository fishRepository;

    private final FishMapper fishMapper;

    public List<FishDto> getFishList() {
        List<Fish> fishList = fishRepository.findAll();

        return fishMapper.convertFishListToFishDtoList(fishList);
    }
}
