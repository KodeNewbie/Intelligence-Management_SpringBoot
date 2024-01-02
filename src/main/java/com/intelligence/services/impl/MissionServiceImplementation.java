package com.intelligence.services.impl;

import com.intelligence.entities.MissionEntity;
import com.intelligence.repositories.MissionRepository;
import com.intelligence.services.MissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class MissionServiceImplementation implements MissionService
{
    @Autowired
    private MissionRepository missionRepository;
    @Override
    public MissionEntity addMission(MissionEntity mission) {
        return this.missionRepository.save(mission);
    }

    @Override
    public List<MissionEntity> getAllMission() {
        return this.missionRepository.findAll();
    }

    @Override
    public MissionEntity getMissionByName(MissionEntity mission) {
        return null;
    }

    @Override
    public MissionEntity getMissionByUserName(MissionEntity mission) {
        return null;
    }

    @Override
    public MissionEntity updateMission(MissionEntity mission) {
        return null;
    }

    @Override
    public MissionEntity deleteMission(MissionEntity mission) {
        return null;
    }

}
