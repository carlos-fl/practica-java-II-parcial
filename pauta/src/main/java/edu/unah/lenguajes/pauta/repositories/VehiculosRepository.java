package edu.unah.lenguajes.pauta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unah.lenguajes.pauta.entities.Vehiculos;

public interface VehiculosRepository extends JpaRepository<Vehiculos, Integer> {
  
}
