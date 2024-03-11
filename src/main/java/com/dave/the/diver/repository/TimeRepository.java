package com.dave.the.diver.repository;

import com.dave.the.diver.entity.Time;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TimeRepository extends JpaRepository<Time, String> {
    Optional<Time> findByName(String name);
}
