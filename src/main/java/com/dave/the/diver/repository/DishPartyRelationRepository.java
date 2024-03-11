package com.dave.the.diver.repository;

import com.dave.the.diver.entity.Dish;
import com.dave.the.diver.entity.DishPartyRelation;
import com.dave.the.diver.entity.Party;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DishPartyRelationRepository extends JpaRepository<DishPartyRelation, String> {
    Optional<DishPartyRelation> findByDishAndParty(Dish dish, Party party);
}
