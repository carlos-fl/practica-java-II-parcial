package edu.unah.lenguajes.pauta.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.unah.lenguajes.pauta.entities.TipoVehiculo;
import edu.unah.lenguajes.pauta.services.servicesImpl.TipoVehiculoImpl;

@RestController
@RequestMapping("/api")
public class TipoVehiculoController {
  
  @Autowired
  private TipoVehiculoImpl tipoVehiculoService;

  @PostMapping("/tipovehiculos/crear")
  public TipoVehiculo createTipoVehiculo(@RequestBody TipoVehiculo tipoVehiculo) {
    return this.tipoVehiculoService.createTipoVehiculo(tipoVehiculo);
  }
}
