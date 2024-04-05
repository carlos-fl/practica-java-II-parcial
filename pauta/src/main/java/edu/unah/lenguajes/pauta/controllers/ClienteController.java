package edu.unah.lenguajes.pauta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.unah.lenguajes.pauta.entities.Cliente;
import edu.unah.lenguajes.pauta.services.servicesImpl.ClienteServiceImpl;

@RestController
@RequestMapping("/api")
public class ClienteController {

  @Autowired
  private ClienteServiceImpl clienteService;

  @PostMapping("/cliente/crear")
  public Cliente createCliente(@RequestBody Cliente cliente) {
    return this.clienteService.createCliente(cliente);
  }

  @GetMapping("/clientes")
  public List<Cliente> getClientes() {
    return this.clienteService.getClientes();
  }

  @GetMapping("clientes/{id}")
  public Cliente getClientePorId(@PathVariable int id) {
    return this.clienteService.getClientePorId(id);
  }
}
