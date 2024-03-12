package com.dave.the.diver.repository;

import com.dave.the.diver.entity.Seasoning;
import com.dave.the.diver.entity.SeasoningSourceRelation;
import com.dave.the.diver.entity.Source;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SeasoningSourceRelationRepository extends JpaRepository<SeasoningSourceRelation, String> {
    Optional<SeasoningSourceRelation> findBySeasoningAndSource(Seasoning seasoning, Source source);
}
