package edu.unah.lenguajes.pruebaunomuchos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unah.lenguajes.pruebaunomuchos.entities.Club;

public interface ClubRepository extends JpaRepository<Club, String> {
  
}
