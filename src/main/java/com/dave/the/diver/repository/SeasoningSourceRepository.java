package com.dave.the.diver.repository;

import com.dave.the.diver.entity.SeasoningSource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeasoningSourceRepository extends JpaRepository<SeasoningSource, String> {
}
