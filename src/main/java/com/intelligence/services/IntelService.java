package com.intelligence.services;

import com.intelligence.entities.IntelEntity;

import java.util.List;

public interface IntelService
{
	IntelEntity addIntel(IntelEntity intel);
	List<IntelEntity> getAllIntel();
	IntelEntity getIntelByTitle(IntelEntity intel);

}
