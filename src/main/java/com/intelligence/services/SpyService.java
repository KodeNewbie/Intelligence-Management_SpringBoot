package com.intelligence.services;

import com.intelligence.entities.MissionEntity;
import org.springframework.stereotype.Service;

import com.intelligence.entities.SpyEntity;

import java.util.List;

public interface SpyService
{
    SpyEntity addSpy(SpyEntity spy);
    List<SpyEntity> getAllSpy();
    SpyEntity getSpyByName(SpyEntity spy);
    SpyEntity getSpyByUserName(SpyEntity spy);
    SpyEntity updateSpy(SpyEntity spy);
    SpyEntity deleteSpy(SpyEntity spy);
}
