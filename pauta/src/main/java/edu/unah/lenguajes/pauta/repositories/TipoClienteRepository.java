package edu.unah.lenguajes.pauta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unah.lenguajes.pauta.entities.TipoCliente;

public interface TipoClienteRepository extends JpaRepository<TipoCliente, Integer> {
  
}
