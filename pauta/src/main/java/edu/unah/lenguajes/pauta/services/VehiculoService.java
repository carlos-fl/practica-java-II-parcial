package edu.unah.lenguajes.pauta.services;

import java.util.List;

import edu.unah.lenguajes.pauta.entities.Vehiculos;

public interface VehiculoService {
  public Vehiculos createVehiculo(Vehiculos vehiculo);

  public List<Vehiculos> getVehiculos();

  public Vehiculos getVehiculoPorId(int id);
}
