package edu.unah.lenguajes.pauta.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.unah.lenguajes.pauta.services.servicesImpl.ReservaServiceImpl;

@RestController
@RequestMapping("/api")
public class ReservaController {
  
  @Autowired
  private ReservaServiceImpl reservaService;

  @PostMapping("/reservas/crear")
  public String createReserva(@RequestParam(name="idCliente") int idCliente, @RequestParam(name="idVehiculo") int idVehiculo, @RequestParam(name="dias") int dias) {
    return this.reservaService.createReserva(idCliente, idVehiculo, dias);
  }
}
