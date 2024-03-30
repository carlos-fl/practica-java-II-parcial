package edu.unah.lenguajes.ejercicio3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.unah.lenguajes.ejercicio3.dto.FacturacionDto;
import edu.unah.lenguajes.ejercicio3.entities.Facturacion;
import edu.unah.lenguajes.ejercicio3.services.servicesImpl.FacturacionServiceImpl;

@RestController
@RequestMapping("/api")
public class FacturacionController {
  
  @Autowired
  private FacturacionServiceImpl facturacionService;

  @PostMapping("/facturacion")
  public Facturacion createFacturacion(@RequestBody FacturacionDto factura) {
    return this.facturacionService.createFacturacion(factura);
  }
}
