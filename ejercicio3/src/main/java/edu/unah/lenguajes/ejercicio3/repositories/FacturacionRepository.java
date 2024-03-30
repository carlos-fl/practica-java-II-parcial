package edu.unah.lenguajes.ejercicio3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unah.lenguajes.ejercicio3.entities.Facturacion;

public interface FacturacionRepository extends JpaRepository<Facturacion, Integer> {
  
}
