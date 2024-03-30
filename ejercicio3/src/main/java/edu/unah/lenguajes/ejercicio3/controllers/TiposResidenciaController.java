package edu.unah.lenguajes.ejercicio3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.unah.lenguajes.ejercicio3.entities.TiposResidencia;
import edu.unah.lenguajes.ejercicio3.services.servicesImpl.TiposResidenciaServiceImpl;

@RestController
@RequestMapping("/api")
public class TiposResidenciaController {
 
  @Autowired
  private TiposResidenciaServiceImpl tiposResService;

  @PostMapping("/residencias/tipos/crear")
  public TiposResidencia createTipoResidencia(@RequestBody TiposResidencia residencia) {
    return this.tiposResService.createTipoResidencia(residencia);
  }
}
