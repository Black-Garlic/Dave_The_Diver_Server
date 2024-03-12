package com.dave.the.diver.repository;

import com.dave.the.diver.entity.Seasoning;
import com.dave.the.diver.entity.SeasoningSeasoningSourceRelation;
import com.dave.the.diver.entity.SeasoningSource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SeasoningSeasoningSourceRepository extends JpaRepository<SeasoningSeasoningSourceRelation, String> {
    Optional<SeasoningSeasoningSourceRelation> findBySeasoningAndSeasoningSource(Seasoning seasoning, SeasoningSource seasoningSource);
}
