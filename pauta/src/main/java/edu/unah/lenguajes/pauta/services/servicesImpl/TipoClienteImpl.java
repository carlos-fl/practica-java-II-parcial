package edu.unah.lenguajes.pauta.services.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unah.lenguajes.pauta.entities.TipoCliente;
import edu.unah.lenguajes.pauta.repositories.TipoClienteRepository;
import edu.unah.lenguajes.pauta.services.TipoClienteService;

@Service
public class TipoClienteImpl implements TipoClienteService {

  @Autowired
  private TipoClienteRepository tipoClienteRepo;

  @Override
  public TipoCliente createTipoCliente(TipoCliente tipoCliente) {
    return this.tipoClienteRepo.save(tipoCliente); 
  }
  
}
