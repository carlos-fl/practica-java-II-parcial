package edu.unah.lenguajes.pauta.services.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unah.lenguajes.pauta.entities.TipoVehiculo;
import edu.unah.lenguajes.pauta.repositories.TipoVehiculoRepository;
import edu.unah.lenguajes.pauta.services.TipoVehiculoService;

@Service
public class TipoVehiculoImpl implements TipoVehiculoService {

  @Autowired
  private TipoVehiculoRepository tipoVehiculoRepo;

  @Override
  public TipoVehiculo createTipoVehiculo(TipoVehiculo tipoVehiculo) {
    return this.tipoVehiculoRepo.save(tipoVehiculo);
  }
  
}
