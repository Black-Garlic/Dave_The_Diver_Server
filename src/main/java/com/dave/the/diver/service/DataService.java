package com.dave.the.diver.service;

import com.dave.the.diver.constant.Data;
import com.dave.the.diver.entity.Dish;
import com.dave.the.diver.entity.DishPartyRelation;
import com.dave.the.diver.entity.Party;
import com.dave.the.diver.entity.Unlock;
import com.dave.the.diver.repository.DishPartyRelationRepository;
import com.dave.the.diver.repository.DishRepository;
import com.dave.the.diver.repository.PartyRepository;
import com.dave.the.diver.repository.UnlockRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DataService {

    private final DishRepository dishRepository;
    private final DishPartyRelationRepository dishPartyRelationRepository;
    private final PartyRepository partyRepository;
    private final UnlockRepository unlockRepository;

    public void generateDefaultDishData() throws JSONException {
        Data.Dish dishData = new Data.Dish();

        List<Party> partyList = partyRepository.findAll();

        for (Data.DishInfo dishInfo : dishData.getDishJsonList()) {
            Dish dish = null;

            Optional<Dish> dishOptional = dishRepository.findById(dishInfo.getDishId());

            if (dishOptional.isEmpty()) {
                Unlock unlock = null;

                if (dishInfo.getUnlock() != null) {
                    Optional<Unlock> unlockOptional = unlockRepository.findByName(dishInfo.getUnlock());

                    if (unlockOptional.isPresent()) {
                        unlock = unlockOptional.get();
                    }
                }

                dish = new Dish(dishInfo, unlock);

                dishRepository.save(dish);
            } else {
                dish = dishOptional.get();
            }

            for (String partyName : dishInfo.getPartyList()) {
                this.generateDishPartyRelation(dish, partyList, partyName);
            }
        }
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
            if (partyRepository.findById(party.getPartyId()).isEmpty()) {
                partyRepository.save(party);
            }
        }
    }

    public void generateDefaultUnlockData() {
        Data.Unlock unlockData = new Data.Unlock();

        for (Unlock unlock : unlockData.getUnlockList()) {
            if (unlockRepository.findById(unlock.getUnlockId()).isEmpty()) {
                unlockRepository.save(unlock);
            }
        }
    }

    public void deleteDefaultDishInfo() {
        dishPartyRelationRepository.deleteAll();
        dishRepository.deleteAll();
    }
}
