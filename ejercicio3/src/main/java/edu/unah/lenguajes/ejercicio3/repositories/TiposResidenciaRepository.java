package edu.unah.lenguajes.ejercicio3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unah.lenguajes.ejercicio3.entities.TiposResidencia;

public interface TiposResidenciaRepository extends JpaRepository<TiposResidencia, Integer> {
  
}
