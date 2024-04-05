package edu.unah.lenguajes.pauta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unah.lenguajes.pauta.entities.TipoVehiculo;

public interface TipoVehiculoRepository extends JpaRepository<TipoVehiculo, Integer> {
  
}
