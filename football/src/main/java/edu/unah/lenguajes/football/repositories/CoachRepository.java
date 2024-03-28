package edu.unah.lenguajes.football.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unah.lenguajes.football.entities.Coach;

public interface CoachRepository extends JpaRepository<Coach, Integer> {
  
}
