package edu.unah.lenguajes.ejercicio3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.unah.lenguajes.ejercicio3.entities.Abonado;
import edu.unah.lenguajes.ejercicio3.services.servicesImpl.AbonadoServiceImpl;

@RestController
@RequestMapping("/api")
public class AbonadoController {
  @Autowired
  private AbonadoServiceImpl abonadoService;

  @PostMapping("/abonados/crear")
  public Abonado createAbonado(@RequestBody Abonado abonado) {
    return this.abonadoService.createAbonado(abonado);
  }

  @GetMapping("/abonados/{dni}")
  public Abonado getAbonado(@PathVariable String dni) {
    return this.abonadoService.getAbonado(dni);
  }

  @DeleteMapping("/abonados/borrar/{dni}")
  public String deleteAbonado(@PathVariable String dni) {
    return this.abonadoService.deleteAbonado(dni);
  }
}
