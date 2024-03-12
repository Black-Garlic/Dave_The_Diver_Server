package com.dave.the.diver.service;

import com.dave.the.diver.dto.DishDto;
import com.dave.the.diver.dto.FishDto;
import com.dave.the.diver.dto.PlantDto;
import com.dave.the.diver.dto.SeasoningDto;
import com.dave.the.diver.entity.*;
import com.dave.the.diver.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DataService {

    private final FishRepository fishRepository;
    private final RegionRepository regionRepository;
    private final TimeRepository timeRepository;
    private final PlantRepository plantRepository;
    private final PlantPlantSourceRelationRepository plantPlantSourceRelationRepository;
    private final PlantSourceRepository plantSourceRepository;
    private final SeasoningRepository seasoningRepository;
    private final SeasoningSeasoningSourceRepository seasoningSeasoningSourceRepository;
    private final SeasoningSourceRepository seasoningSourceRepository;
    private final DishRepository dishRepository;
    private final DishPartyRelationRepository dishPartyRelationRepository;
    private final PartyRepository partyRepository;
    private final UnlockRepository unlockRepository;

    private final DefaultDataService defaultDataService;

    public void generateDefaultFishData() throws JSONException {
        List<FishDto> fishDtoList = defaultDataService.getDefaultFishDtoList();
        List<Region> regionList = regionRepository.findAll();
        List<Time> timeList = timeRepository.findAll();

        for (FishDto fishDto : fishDtoList) {
            Fish fish;

            Optional<Fish> fishOptional = fishRepository.findById(fishDto.getFishId());

            Region region = this.getRegion(fishDto.getRegion(), regionList);
            Time time = this.getTime(fishDto.getTime(), timeList);

            if (fishOptional.isEmpty()) {
                fish = new Fish(fishDto, region, time);
            } else {
                fish = fishOptional.get();

                fish.updateFish(fishDto, region, time);
            }

            fishRepository.save(fish);
        }
    }

    private Region getRegion(
        String regionName,
        List<Region> regionList
    ) {
        if (regionName == null) {
            return null;
        }

        for (Region region : regionList) {
            if (region.getName().equals(regionName)) {
                return region;
            }
        }

        return null;
    }

    private Time getTime(
        String timeName,
        List<Time> timeList
    ) {
        if (timeName == null) {
            return null;
        }

        for (Time time : timeList) {
            if (time.getName().equals(timeName)) {
                return time;
            }
        }

        return null;
    }

    public void generateDefaultRegionData() {
        List<FishDto.RegionDto> regionDtoList = defaultDataService.getDefaultRegionDtoList();

        for (FishDto.RegionDto regionDto : regionDtoList) {
            Region region;

            Optional<Region> regionOptional = regionRepository.findById(regionDto.getRegionId());

            if (regionOptional.isEmpty()) {
                region = new Region(regionDto);
            } else {
                region = regionOptional.get();
                region.updateRegion(regionDto);
            }

            regionRepository.save(region);
        }
    }

    public void generateDefaultTimeData() {
        List<FishDto.TimeDto> timeDtoList = defaultDataService.getDefaultTimeDtoList();

        for (FishDto.TimeDto timeDto : timeDtoList) {
            Time time;

            Optional<Time> timeOptional = timeRepository.findById(timeDto.getTimeId());

            if (timeOptional.isEmpty()) {
                time = new Time(timeDto);
            } else {
                time = timeOptional.get();
                time.updateTime(timeDto);
            }

            timeRepository.save(time);
        }
    }

    public void generateDefaultPlantData() throws JSONException {
        List<PlantDto> plantDtoList = defaultDataService.getDefaultPlantDtoList();
        List<PlantSource> plantSourceList = plantSourceRepository.findAll();

        for (PlantDto plantDto : plantDtoList) {
            Plant plant;

            Optional<Plant> plantOptional = plantRepository.findById(plantDto.getPlantId());

            if (plantOptional.isEmpty()) {
                plant = new Plant(plantDto);
            } else {
                plant = plantOptional.get();
                plant.updatePlant(plantDto);
            }

            plantRepository.save(plant);

            for (String plantSourceName : plantDto.getPlantSourceList()) {
                this.generatePlantPlantSourceRelation(plant, plantSourceList, plantSourceName);
            }
        }
    }

    private void generatePlantPlantSourceRelation(
        Plant plant,
        List<PlantSource> plantSourceList,
        String plantSourceName
    ) {
        if (plantSourceName == null) {
            return;
        }

        for (PlantSource plantSource : plantSourceList) {
            if (plantSource.getName().equals(plantSourceName) &&
                plantPlantSourceRelationRepository.findByPlantAndPlantSource(plant, plantSource).isEmpty()) {
                PlantPlantSourceRelation plantPlantSourceRelation = new PlantPlantSourceRelation(plant, plantSource);
                plantPlantSourceRelationRepository.save(plantPlantSourceRelation);
            }
        }
    }

    public void generateDefaultPlantSourceData() {
        List<PlantDto.PlantSourceDto> plantSourceDtoList = defaultDataService.getDefaultPlantSourceDtoList();

        for (PlantDto.PlantSourceDto plantSourceDto : plantSourceDtoList) {
            PlantSource plantSource;

            Optional<PlantSource> plantSourceOptional = plantSourceRepository.findById(plantSourceDto.getPlantSourceId());

            if (plantSourceOptional.isEmpty()) {
                plantSource = new PlantSource(plantSourceDto);
            } else {
                plantSource = plantSourceOptional.get();
                plantSource.updatePlantSource(plantSourceDto);
            }

            plantSourceRepository.save(plantSource);
        }
    }

    public void generateDefaultSeasoningData() throws JSONException {
        List<SeasoningDto> seasoningDtoList = defaultDataService.getDefaultSeasoningDtoList();
        List<SeasoningSource> seasoningSourceList = seasoningSourceRepository.findAll();

        for (SeasoningDto seasoningDto : seasoningDtoList) {
            Seasoning seasoning;

            Optional<Seasoning> seasoningOptional = seasoningRepository.findById(seasoningDto.getSeasoningId());

            if (seasoningOptional.isEmpty()) {
                seasoning = new Seasoning(seasoningDto);
            } else {
                seasoning = seasoningOptional.get();
                seasoning.updateSeasoning(seasoningDto);
            }

            seasoningRepository.save(seasoning);

            for (String seasoningSourceName : seasoningDto.getSeasoningSourceList()) {
                this.generateSeasoningSeasoningSourceRelation(seasoning, seasoningSourceList, seasoningSourceName);
            }
        }
    }

    private void generateSeasoningSeasoningSourceRelation(
        Seasoning seasoning,
        List<SeasoningSource> seasoningSourceList,
        String seasoningSourceName
    ) {
        if (seasoningSourceName == null) {
            return;
        }

        for (SeasoningSource seasoningSource : seasoningSourceList) {
            if (seasoningSource.getName().equals(seasoningSourceName) &&
                seasoningSeasoningSourceRepository.findBySeasoningAndSeasoningSource(seasoning, seasoningSource).isEmpty()) {
                SeasoningSeasoningSourceRelation seasoningSeasoningSourceRelation = new SeasoningSeasoningSourceRelation(seasoning, seasoningSource);
                seasoningSeasoningSourceRepository.save(seasoningSeasoningSourceRelation);
            }
        }
    }

    public void generateDefaultSeasoningSourceData() {
        List<SeasoningDto.SeasoningSourceDto> seasoningSourceDtoList = defaultDataService.getDefaultSeasoningSourceDtoList();

        for (SeasoningDto.SeasoningSourceDto seasoningSourceDto : seasoningSourceDtoList) {
            SeasoningSource seasoningSource;

            Optional<SeasoningSource> seasoningSourceOptional = seasoningSourceRepository.findById(seasoningSourceDto.getSeasoningSourceId());

            if (seasoningSourceOptional.isEmpty()) {
                seasoningSource = new SeasoningSource(seasoningSourceDto);
            } else {
                seasoningSource = seasoningSourceOptional.get();
                seasoningSource.updateSeasoningSource(seasoningSourceDto);
            }

            seasoningSourceRepository.save(seasoningSource);
        }
    }

    public void generateDefaultDishData() throws JSONException {
        List<DishDto> dishDtoList = defaultDataService.getDefaultDishDtoList();
        List<Party> partyList = partyRepository.findAll();
        List<Unlock> unlockList = unlockRepository.findAll();

        for (DishDto dishDto : dishDtoList) {
            Dish dish;

            Optional<Dish> dishOptional = dishRepository.findById(dishDto.getDishId());

            Unlock unlock = this.getUnlock(dishDto.getUnlock(), unlockList);

            if (dishOptional.isEmpty()) {
                dish = new Dish(dishDto, unlock);
            } else {
                dish = dishOptional.get();
                dish.updateDish(dishDto, unlock);
            }

            dishRepository.save(dish);

            for (String partyName : dishDto.getPartyList()) {
                this.generateDishPartyRelation(dish, partyList, partyName);
            }
        }
    }

    private Unlock getUnlock(
        String unlockName,
        List<Unlock> unlockList
    ) {
        if (unlockName == null) {
            return null;
        }

        for (Unlock unlock : unlockList) {
            if (unlock.getName().equals(unlockName)) {
                return unlock;
            }
        }

        return null;
    }

    private void generateDishPartyRelation(
        Dish dish,
        List<Party> partyList,
        String partyName
    ) {
        if (partyName == null) {
            return;
        }

        for (Party party : partyList) {
            if (party.getName().equals(partyName) &&
                dishPartyRelationRepository.findByDishAndParty(dish, party).isEmpty()) {
                DishPartyRelation dishPartyRelation = new DishPartyRelation(dish, party);
                dishPartyRelationRepository.save(dishPartyRelation);
            }
        }
    }

    public void generateDefaultPartyData() {
        List<DishDto.PartyDto> partyDtoList = defaultDataService.getDefaultPartyDtoList();

        for (DishDto.PartyDto partyDto : partyDtoList) {
            Party party;

            Optional<Party> partyOptional = partyRepository.findById(partyDto.getPartyId());

            if (partyOptional.isEmpty()) {
                party = new Party(partyDto);
            } else {
                party = partyOptional.get();
                party.updateParty(partyDto);
            }

            partyRepository.save(party);
        }
    }

    public void generateDefaultUnlockData() {
        List<DishDto.UnlockDto> unlockDtoList = defaultDataService.getDefaultUnlockDtoList();

        for (DishDto.UnlockDto unlockDto : unlockDtoList) {
            Unlock unlock;

            Optional<Unlock> unlockOptional = unlockRepository.findById(unlockDto.getUnlockId());

            if (unlockOptional.isEmpty()) {
                unlock = new Unlock(unlockDto);
            } else {
                unlock = unlockOptional.get();
                unlock.updateUnlock(unlockDto);
            }

            unlockRepository.save(unlock);
        }
    }

    public void deleteDefaultDishInfo() {
        dishPartyRelationRepository.deleteAll();
        dishRepository.deleteAll();
    }
}
