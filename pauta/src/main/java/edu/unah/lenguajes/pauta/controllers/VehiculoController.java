package edu.unah.lenguajes.pauta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.unah.lenguajes.pauta.entities.Vehiculos;
import edu.unah.lenguajes.pauta.services.servicesImpl.VehiculoServiceImpl;

@RestController
@RequestMapping("/api")
public class VehiculoController {
  
  @Autowired
  private VehiculoServiceImpl vehiculoService;

  @PostMapping("/vehiculo/crear")
  public Vehiculos createVehiculo(@RequestBody Vehiculos vehiculo) {
    return this.vehiculoService.createVehiculo(vehiculo);
  }

  @GetMapping("/vehiculos")
  public List<Vehiculos> getVehiculos() {
    return this.vehiculoService.getVehiculos();
  }

  @GetMapping("/vehiculos/{id}")
  public Vehiculos getVehiculoPorId(@PathVariable int id) {
    return this.vehiculoService.getVehiculoPorId(id);
  }
}
