package com.intelligence.controllers;

import com.intelligence.entities.SpyEntity;
import com.intelligence.services.SpyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/spy")
public class SpyController
{
    @Autowired
    SpyService spyService;

    @RequestMapping(path = "/add", method = RequestMethod.POST)
    public ResponseEntity<SpyEntity> addSpy(@RequestBody SpyEntity spy)
    {
        return new ResponseEntity<SpyEntity>(this.spyService.addSpy(spy), HttpStatus.CREATED);
    }
    @RequestMapping(path = "/getAllSpy", method = RequestMethod.GET)
    public ResponseEntity<List<SpyEntity>> getAllSpy()
    {
        return new ResponseEntity<List<SpyEntity>>(this.spyService.getAllSpy(), HttpStatus.OK);
    }
}
