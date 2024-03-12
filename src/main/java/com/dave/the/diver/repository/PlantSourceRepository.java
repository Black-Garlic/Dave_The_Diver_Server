package com.dave.the.diver.repository;

import com.dave.the.diver.entity.PlantSource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlantSourceRepository extends JpaRepository<PlantSource, String> {
}
