package com.dave.the.diver.repository;

import com.dave.the.diver.entity.DishLevel;
import com.dave.the.diver.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DishLevelRepository extends JpaRepository<DishLevel, String> {
    List<DishLevel> findByProfile(Profile profile);
}
