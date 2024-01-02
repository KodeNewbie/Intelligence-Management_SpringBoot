package com.intelligence.controllers;

import com.intelligence.entities.MissionEntity;
import com.intelligence.services.MissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/mission")
public class MissionController
{
    @Autowired
    MissionService missionService;

    @RequestMapping(path = "/add" , method = RequestMethod.POST)
    public ResponseEntity<MissionEntity> addMission(@RequestBody MissionEntity mission)
    {
        return new ResponseEntity<MissionEntity>(this.missionService.addMission(mission), HttpStatus.CREATED);
    }
    @RequestMapping(path = "/getAllMissions" , method = RequestMethod.GET)
    public ResponseEntity<List<MissionEntity>> getAllMission()
    {
        return new ResponseEntity<List<MissionEntity>>(this.missionService.getAllMission(), HttpStatus.OK);
    }
//    @RequestMapping(path = "/getMissionByName" , method = RequestMethod.GET)
//    public ResponseEntity<MissionEntity> getMissionByName(@RequestBody MissionEntity mission)
//    {
//        return new ResponseEntity<MissionEntity>(this.missionService.getMissionByName(mission), HttpStatus.OK);
//    }

}
