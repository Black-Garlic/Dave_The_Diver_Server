package com.dave.the.diver.repository;

import com.dave.the.diver.entity.Seasoning;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeasoningRepository extends JpaRepository<Seasoning, String> {
}
