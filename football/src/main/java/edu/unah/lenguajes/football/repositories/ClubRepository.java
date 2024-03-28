package edu.unah.lenguajes.football.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unah.lenguajes.football.entities.Club;

public interface ClubRepository extends JpaRepository<Club, Integer> {
  
}
