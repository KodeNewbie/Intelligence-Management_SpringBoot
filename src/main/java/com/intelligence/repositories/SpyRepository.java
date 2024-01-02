package com.intelligence.repositories;

import com.intelligence.entities.SpyEntity;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
public interface SpyRepository extends JpaRepository<SpyEntity, Long>
{

}
