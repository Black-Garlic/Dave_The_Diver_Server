package com.dave.the.diver.repository;

import com.dave.the.diver.entity.Plant;
import com.dave.the.diver.entity.PlantSourceRelation;
import com.dave.the.diver.entity.Source;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PlantSourceRelationRepository extends JpaRepository<PlantSourceRelation, String> {
    Optional<PlantSourceRelation> findByPlantAndSource(Plant plant, Source source);
}
