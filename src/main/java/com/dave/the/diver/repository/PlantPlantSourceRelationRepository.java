package com.dave.the.diver.repository;

import com.dave.the.diver.entity.Plant;
import com.dave.the.diver.entity.PlantPlantSourceRelation;
import com.dave.the.diver.entity.PlantSource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PlantPlantSourceRelationRepository extends JpaRepository<PlantPlantSourceRelation, String> {
    Optional<PlantPlantSourceRelation> findByPlantAndPlantSource(Plant plant, PlantSource plantSource);
}
