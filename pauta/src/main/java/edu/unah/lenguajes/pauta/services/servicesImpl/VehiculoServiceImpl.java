package edu.unah.lenguajes.pauta.services.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unah.lenguajes.pauta.entities.Vehiculos;
import edu.unah.lenguajes.pauta.repositories.VehiculosRepository;
import edu.unah.lenguajes.pauta.services.VehiculoService;

@Service
public class VehiculoServiceImpl implements VehiculoService {

  @Autowired
  private VehiculosRepository vehiculoRepo;

  @Override
  public Vehiculos createVehiculo(Vehiculos vehiculo) {
    return this.vehiculoRepo.save(vehiculo);
  }

  @Override
  public List<Vehiculos> getVehiculos() {
    return this.vehiculoRepo.findAll();
  }

  @Override
  public Vehiculos getVehiculoPorId(int id) {
    if(this.vehiculoRepo.existsById(id))
      return this.vehiculoRepo.findById(id).get();

    return null;
  }
   
}
