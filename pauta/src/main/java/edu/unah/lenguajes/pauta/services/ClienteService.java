package edu.unah.lenguajes.pauta.services;

import java.util.List;

import edu.unah.lenguajes.pauta.entities.Cliente;

public interface ClienteService {

  public Cliente createCliente(Cliente cliente);
  
  public List<Cliente> getClientes();

  public Cliente getClientePorId(int id);
  
}
