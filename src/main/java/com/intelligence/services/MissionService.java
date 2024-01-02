package com.intelligence.services;

import org.springframework.stereotype.Service;

import com.intelligence.entities.MissionEntity;

import java.util.List;

public interface MissionService
{
    MissionEntity addMission(MissionEntity mission);

    List<MissionEntity> getAllMission();

    MissionEntity getMissionByName(MissionEntity mission);
    MissionEntity getMissionByUserName(MissionEntity mission);
    MissionEntity updateMission(MissionEntity mission);
    MissionEntity deleteMission(MissionEntity mission);
}
