package edu.unah.lenguajes.pruebaunomuchos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unah.lenguajes.pruebaunomuchos.entities.Player;

public interface PlayerRepository extends JpaRepository<Player, String> {
  
}
