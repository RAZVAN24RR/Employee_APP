package com.yourcompany.service;


import com.yourcompany.model.Team;
import com.yourcompany.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
// import java.util.List;
// import java.util.Optional;

@Service
public class TeamService {
    @Autowired

    private TeamRepository teamRepository;

    public Team addTeam(Team team){
        return teamRepository.save(team);
    }
}
