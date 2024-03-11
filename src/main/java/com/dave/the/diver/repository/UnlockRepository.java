package com.dave.the.diver.repository;

import com.dave.the.diver.entity.Unlock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UnlockRepository extends JpaRepository<Unlock, String> {
    Optional<Unlock> findByName(String name);
}
