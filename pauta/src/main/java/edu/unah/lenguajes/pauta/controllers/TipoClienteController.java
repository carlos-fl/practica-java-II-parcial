package edu.unah.lenguajes.pauta.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.unah.lenguajes.pauta.entities.TipoCliente;
import edu.unah.lenguajes.pauta.services.servicesImpl.TipoClienteImpl;

@RestController
@RequestMapping("/api")
public class TipoClienteController {
 
  @Autowired
  private TipoClienteImpl tipoClienteService;

  @PostMapping("/tipoclientes/crear")
  public TipoCliente createTipoCliente(@RequestBody TipoCliente tipoCliente) {
    return this.tipoClienteService.createTipoCliente(tipoCliente);
  }
}
