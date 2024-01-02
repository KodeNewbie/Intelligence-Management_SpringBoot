package com.intelligence.repositories;

import com.intelligence.entities.MissionEntity;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MissionRepository extends JpaRepository<MissionEntity,Long>
{

}
