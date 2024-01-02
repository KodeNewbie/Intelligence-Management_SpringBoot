package com.intelligence.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intelligence.entities.IntelEntity;

public interface IntelRepository extends JpaRepository<IntelEntity, Long> {

}
