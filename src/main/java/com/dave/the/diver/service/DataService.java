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
import org.hibernate.sql.Update;
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

            Unlock unlock = this.getUnlock(dishInfo.getUnlock());

            if (dishOptional.isEmpty()) {
                dish = new Dish(dishInfo, unlock);

                dishRepository.save(dish);
            } else {
                dish = dishOptional.get();

                dish.updateDish(dishInfo, unlock);

                dishRepository.save(dish);
            }

            for (String partyName : dishInfo.getPartyList()) {
                this.generateDishPartyRelation(dish, partyList, partyName);
            }
        }
    }

    private Unlock getUnlock(
        String unlockName
    ) {
        Unlock unlock = null;

        if (unlockName != null) {
            Optional<Unlock> unlockOptional = unlockRepository.findByName(unlockName);

            if (unlockOptional.isPresent()) {
                unlock = unlockOptional.get();
            }
        }

        return unlock;
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
