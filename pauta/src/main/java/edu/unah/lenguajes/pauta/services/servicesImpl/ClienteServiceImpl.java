package edu.unah.lenguajes.pauta.services.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unah.lenguajes.pauta.entities.Cliente;
import edu.unah.lenguajes.pauta.repositories.ClienteRepository;
import edu.unah.lenguajes.pauta.services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

  @Autowired
  private ClienteRepository clienteRepo;

  @Override
  public Cliente createCliente(Cliente cliente) {
    return this.clienteRepo.save(cliente);
  }

  @Override
  public List<Cliente> getClientes() {
    return this.clienteRepo.findAll();
  }

  @Override
  public Cliente getClientePorId(int id) {
    if (this.clienteRepo.existsById(id)) {
      return this.clienteRepo.findById(id).get();
    }
    return null;
  }

}
