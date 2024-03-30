package edu.unah.lenguajes.ejercicio3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unah.lenguajes.ejercicio3.entities.Abonado;

public interface AbonadoRepository extends JpaRepository<Abonado, String> {
  
}
