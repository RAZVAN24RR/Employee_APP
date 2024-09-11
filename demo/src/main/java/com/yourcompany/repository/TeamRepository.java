package com.yourcompany.repository;

import com.yourcompany.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface TeamRepository extends JpaRepository<Team, Long>{}

