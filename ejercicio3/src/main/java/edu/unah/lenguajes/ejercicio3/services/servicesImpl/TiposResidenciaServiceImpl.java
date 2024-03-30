package edu.unah.lenguajes.ejercicio3.services.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unah.lenguajes.ejercicio3.entities.TiposResidencia;
import edu.unah.lenguajes.ejercicio3.repositories.TiposResidenciaRepository;
import edu.unah.lenguajes.ejercicio3.services.TiposResidenciaService;

@Service
public class TiposResidenciaServiceImpl implements TiposResidenciaService {

  @Autowired
  private TiposResidenciaRepository tiposResidenciaRepo;

  @Override
  public TiposResidencia createTipoResidencia(TiposResidencia tipoResidencia) {
    return this.tiposResidenciaRepo.save(tipoResidencia);
  }
  
}
