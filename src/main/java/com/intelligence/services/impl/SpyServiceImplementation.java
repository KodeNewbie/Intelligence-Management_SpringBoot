package com.intelligence.services.impl;

import com.intelligence.entities.SpyEntity;
import com.intelligence.repositories.SpyRepository;
import com.intelligence.services.SpyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpyServiceImplementation implements SpyService {
    @Autowired
    private SpyRepository spyRepository;
    @Override
    public SpyEntity addSpy(SpyEntity spy) {
        return this.spyRepository.save(spy);
    }

    @Override
    public List<SpyEntity> getAllSpy() {
        return this.spyRepository.findAll();
    }

    @Override
    public SpyEntity getSpyByName(SpyEntity spy) {
        return null;
    }

    @Override
    public SpyEntity getSpyByUserName(SpyEntity spy) {
        return null;
    }

    @Override
    public SpyEntity updateSpy(SpyEntity spy) {
        return null;
    }

    @Override
    public SpyEntity deleteSpy(SpyEntity spy) {
        return null;
    }
}
