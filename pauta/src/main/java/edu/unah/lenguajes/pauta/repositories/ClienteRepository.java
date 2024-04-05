package edu.unah.lenguajes.pauta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unah.lenguajes.pauta.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
  
}
