package com.intelligence.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intelligence.entities.IntelEntity;
import com.intelligence.repositories.IntelRepository;
import com.intelligence.services.IntelService;

import java.util.List;

@Service
public class IntelServiceImplementation implements IntelService
{
	@Autowired
	IntelRepository intelRepository;
	@Override
	public IntelEntity addIntel(IntelEntity intel) {
		
		return this.intelRepository.save(intel);
	}

	@Override
	public List<IntelEntity> getAllIntel() {
		return this.intelRepository.findAll();
	}

	@Override
	public IntelEntity getIntelByTitle(IntelEntity intel) {
		return null;
	}

}
