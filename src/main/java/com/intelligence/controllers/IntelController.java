package com.intelligence.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.intelligence.entities.IntelEntity;
import com.intelligence.services.IntelService;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping(path ="/intel")
public class IntelController
{

	@Autowired
	IntelService intelService;
	
	@RequestMapping(path = "/add", method = RequestMethod.POST)
	public ResponseEntity<IntelEntity> addIntel(@RequestBody IntelEntity intel)
	{
		return new ResponseEntity<IntelEntity>(this.intelService.addIntel(intel), HttpStatus.CREATED);
	}

	@RequestMapping(path = "/getAllIntel", method = RequestMethod.GET)
	public ResponseEntity<List<IntelEntity>> getAllIntel()
	{
		return new ResponseEntity<List<IntelEntity>>(this.intelService.getAllIntel(), HttpStatus.OK);
	}
	
}
