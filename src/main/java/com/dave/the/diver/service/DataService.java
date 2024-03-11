package com.dave.the.diver.service;

import com.dave.the.diver.constant.Data;
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
    private final DishRepository dishRepository;
    private final DishPartyRelationRepository dishPartyRelationRepository;
    private final PartyRepository partyRepository;
    private final UnlockRepository unlockRepository;

    public void generateDefaultFishData() throws JSONException {
        Data.Fish fishData = new Data.Fish();

        List<Region> regionList = regionRepository.findAll();
        List<Time> timeList = timeRepository.findAll();

        for (Data.FishInfo fishInfo : fishData.getFishInfoList()) {
            Fish fish;

            Optional<Fish> fishOptional = fishRepository.findById(fishInfo.getFishId());

            Region region = this.getRegion(fishInfo.getRegion(), regionList);
            Time time = this.getTime(fishInfo.getTime(), timeList);

            if (fishOptional.isEmpty()) {
                fish = new Fish(fishInfo, region, time);
            } else {
                fish = fishOptional.get();

                fish.updateFish(fishInfo, region, time);
            }

            fishRepository.save(fish);
        }
    }

    public Region getRegion(
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

    public Time getTime(
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
        Data.Region regionData = new Data.Region();

        for (Region region : regionData.getRegionList()) {
            Optional<Region> regionOptional = regionRepository.findById(region.getRegionId());

            if (regionOptional.isEmpty()) {
                regionRepository.save(region);
            } else {
                Region existRegion = regionOptional.get();

                existRegion.updateRegion(region.getName(), region.getColor());

                regionRepository.save(existRegion);
            }
        }
    }

    public void generateDefaultTimeData() {
        Data.Time timeData = new Data.Time();

        for (Time time : timeData.getTimeList()) {
            Optional<Time> timeOptional = timeRepository.findById(time.getTimeId());

            if (timeOptional.isEmpty()) {
                timeRepository.save(time);
            } else {
                Time existTime = timeOptional.get();

                existTime.updateTime(time.getName(), time.getColor());

                timeRepository.save(existTime);
            }
        }
    }

    public void generateDefaultDishData() throws JSONException {
        Data.Dish dishData = new Data.Dish();

        List<Party> partyList = partyRepository.findAll();
        List<Unlock> unlockList = unlockRepository.findAll();

        for (Data.DishInfo dishInfo : dishData.getDishJsonList()) {
            Dish dish;

            Optional<Dish> dishOptional = dishRepository.findById(dishInfo.getDishId());

            Unlock unlock = this.getUnlock(dishInfo.getUnlock(), unlockList);

            if (dishOptional.isEmpty()) {
                dish = new Dish(dishInfo, unlock);
            } else {
                dish = dishOptional.get();

                dish.updateDish(dishInfo, unlock);
            }

            dishRepository.save(dish);

            for (String partyName : dishInfo.getPartyList()) {
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
        for (Party party : partyList) {
            boolean partyEqual = party.getName().equals(partyName);
            boolean exist = dishPartyRelationRepository.findByDishAndParty(dish, party).isPresent();

            if (partyEqual && !exist) {
                DishPartyRelation dishPartyRelation = new DishPartyRelation(dish, party);
                dishPartyRelationRepository.save(dishPartyRelation);
            }
        }
    }

    public void generateDefaultPartyData() {
        Data.Party partyData = new Data.Party();

        for (Party party : partyData.getPartyList()) {
            Optional<Party> partyOptional = partyRepository.findById(party.getPartyId());

            if (partyOptional.isEmpty()) {
                partyRepository.save(party);
            } else {
                Party existParty = partyOptional.get();

                existParty.updateParty(party.getName(), party.getColor());

                partyRepository.save(existParty);
            }
        }
    }

    public void generateDefaultUnlockData() {
        Data.Unlock unlockData = new Data.Unlock();

        for (Unlock unlock : unlockData.getUnlockList()) {
            Optional<Unlock> unlockOptional = unlockRepository.findById(unlock.getUnlockId());

            if (unlockOptional.isEmpty()) {
                unlockRepository.save(unlock);
            } else {
                Unlock existUnlock = unlockOptional.get();

                existUnlock.updateUnlock(unlock.getName());

                unlockRepository.save(existUnlock);
            }
        }
    }

    public void deleteDefaultDishInfo() {
        dishPartyRelationRepository.deleteAll();
        dishRepository.deleteAll();
    }
}
