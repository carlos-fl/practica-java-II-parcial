package edu.unah.lenguajes.ejercicio2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unah.lenguajes.ejercicio2.entities.HistoricoPagos;

public interface HistoricoPagosRepository extends JpaRepository<HistoricoPagos, Integer> {
  
}
