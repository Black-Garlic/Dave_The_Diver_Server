package com.dave.the.diver.service;

import com.dave.the.diver.dto.*;
import com.dave.the.diver.entity.*;
import com.dave.the.diver.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DataService {

    private final FishRepository fishRepository;
    private final RegionRepository regionRepository;
    private final TimeRepository timeRepository;
    private final PlantRepository plantRepository;
    private final PlantSourceRelationRepository plantSourceRelationRepository;
    private final SeasoningRepository seasoningRepository;
    private final SeasoningSourceRelationRepository seasoningSourceRelationRepository;
    private final SourceRepository sourceRepository;
    private final DishRepository dishRepository;
    private final DishPartyRelationRepository dishPartyRelationRepository;
    private final PartyRepository partyRepository;
    private final UnlockRepository unlockRepository;
    private final RecipeRepository recipeRepository;

    private final DefaultDataService defaultDataService;

    public void generateTotalDefaultData() throws JSONException {
        // Fish
        this.generateDefaultRegionData();
        this.generateDefaultTimeData();
        this.generateDefaultFishData();

        // Plant
        this.generateDefaultPlantSourceData();
        this.generateDefaultPlantData();

        // Seasoning
        this.generateDefaultSeasoningSourceData();
        this.generateDefaultSeasoningData();

        // Dish
        this.generateDefaultPartyData();
        this.generateDefaultUnlockData();
        this.generateDefaultDishData();
        this.generateDefaultRecipeData();
    }

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
        List<Source> sourceList = sourceRepository.findAll();

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

            for (String plantSourceName : plantDto.getSourceList()) {
                this.generatePlantPlantSourceRelation(plant, sourceList, plantSourceName);
            }
        }
    }

    private void generatePlantPlantSourceRelation(
        Plant plant,
        List<Source> sourceList,
        String plantSourceName
    ) {
        if (plantSourceName == null) {
            return;
        }

        for (Source source : sourceList) {
            if (source.getName().equals(plantSourceName) &&
                plantSourceRelationRepository.findByPlantAndSource(plant, source).isEmpty()) {
                PlantSourceRelation plantPlantSourceRelation = new PlantSourceRelation(plant, source);
                plantSourceRelationRepository.save(plantPlantSourceRelation);
            }
        }
    }

    public void generateDefaultPlantSourceData() {
        List<SourceDto> sourceDtoList = defaultDataService.getDefaultPlantSourceDtoList();

        for (SourceDto sourceDto : sourceDtoList) {
            Source source;

            Optional<Source> sourceOptional = sourceRepository.findById(sourceDto.getSourceId());

            if (sourceOptional.isEmpty()) {
                source = new Source(sourceDto);
            } else {
                source = sourceOptional.get();
                source.updateSource(sourceDto);
            }

            sourceRepository.save(source);
        }
    }

    public void generateDefaultSeasoningData() throws JSONException {
        List<SeasoningDto> seasoningDtoList = defaultDataService.getDefaultSeasoningDtoList();
        List<Source> sourceList = sourceRepository.findAll();

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
                this.generateSeasoningSeasoningSourceRelation(seasoning, sourceList, seasoningSourceName);
            }
        }
    }

    private void generateSeasoningSeasoningSourceRelation(
        Seasoning seasoning,
        List<Source> sourceList,
        String seasoningSourceName
    ) {
        if (seasoningSourceName == null) {
            return;
        }

        for (Source source : sourceList) {
            if (source.getName().equals(seasoningSourceName) &&
                seasoningSourceRelationRepository.findBySeasoningAndSource(seasoning, source).isEmpty()) {
                SeasoningSourceRelation seasoningSourceRelation = new SeasoningSourceRelation(seasoning, source);
                seasoningSourceRelationRepository.save(seasoningSourceRelation);
            }
        }
    }

    public void generateDefaultSeasoningSourceData() {
        List<SourceDto> seasoningSourceDtoList = defaultDataService.getDefaultSeasoningSourceDtoList();

        for (SourceDto sourceDto : seasoningSourceDtoList) {
            Source source;

            Optional<Source> seasoningSourceOptional = sourceRepository.findById(sourceDto.getSourceId());

            if (seasoningSourceOptional.isEmpty()) {
                source = new Source(sourceDto);
            } else {
                source = seasoningSourceOptional.get();
                source.updateSource(sourceDto);
            }

            sourceRepository.save(source);
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

    public void generateDefaultRecipeData() throws JSONException {
        List<RecipeDto> recipeDtoList = defaultDataService.getDefaultRecipeData();
        List<Dish> dishList = dishRepository.findAll();

        for (RecipeDto recipeDto : recipeDtoList) {
            Recipe recipe;

            Dish dish = this.getDish(dishList, recipeDto.getDishId());

            Optional<Recipe> recipeOptional = recipeRepository.findByDishAndIngredientId(dish, recipeDto.getIngredientId());

            if (recipeOptional.isEmpty()) {
                recipe = new Recipe(recipeDto, dish);
            } else {
                recipe = recipeOptional.get();
                recipe.updateRecipe(recipeDto, dish);
            }

            recipeRepository.save(recipe);
        }
    }

    private Dish getDish(
        List<Dish> dishList,
        String dishId
    ) {
        if (dishId == null) {
            return null;
        }

        for (Dish dish : dishList) {
            if (dish.getDishId().equals(dishId)) {
                return dish;
            }
        }

        return null;
    }

    public void deleteTotalDefaultData() {
        // Fish
        this.deleteDefaultFishData();

        // Plant
        this.deleteDefaultPlantData();

        // Seasoning
        this.deleteDefaultSeasoningData();

        // Source
        this.deleteDefaultSourceData();

        // Dish
        this.deleteDefaultDishInfo();
    }

    public void deleteDefaultFishData() {
        fishRepository.deleteAll();
        regionRepository.deleteAll();
        timeRepository.deleteAll();
    }

    public void deleteDefaultPlantData() {
        plantSourceRelationRepository.deleteAll();
        plantRepository.deleteAll();
    }

    public void deleteDefaultSeasoningData() {
        seasoningSourceRelationRepository.deleteAll();
        seasoningRepository.deleteAll();
    }

    public void deleteDefaultSourceData() {
        sourceRepository.deleteAll();
    }

    public void deleteDefaultDishInfo() {
        recipeRepository.deleteAll();
        dishPartyRelationRepository.deleteAll();
        dishRepository.deleteAll();
        partyRepository.findAll();
        unlockRepository.deleteAll();
    }
}
