package com.yourcompany.controller;

import com.yourcompany.model.Team;
import com.yourcompany.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
// import java.util.List;

@RestController

@RequestMapping("/teams")

public class TeamController {
    
    @Autowired
    private TeamService teamService;

    @PostMapping("/addTeam")
    public ResponseEntity<?> addTeam(@RequestBody Team team){

        if(team.getName() == null || team.getDepartment() == null ){
            return new ResponseEntity<>( "Data request required", HttpStatus.BAD_REQUEST);
        }

        Team savedTeam = teamService.addTeam(team);
        return new ResponseEntity<>(savedTeam, HttpStatus.CREATED);

    }
}