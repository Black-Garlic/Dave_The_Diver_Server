package com.dave.the.diver.repository;

import com.dave.the.diver.entity.DishLevel;
import com.dave.the.diver.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DishLevelRepository extends JpaRepository<DishLevel, String> {
    List<DishLevel> findByProfile(Profile profile);
}
