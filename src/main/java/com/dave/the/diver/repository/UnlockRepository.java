package com.dave.the.diver.repository;

import com.dave.the.diver.entity.Unlock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnlockRepository extends JpaRepository<Unlock, String> {
}
