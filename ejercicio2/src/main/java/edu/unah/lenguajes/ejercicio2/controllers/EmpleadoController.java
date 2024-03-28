package edu.unah.lenguajes.ejercicio2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.unah.lenguajes.ejercicio2.dto.PagoEmpleado;
import edu.unah.lenguajes.ejercicio2.dto.Pagos;
import edu.unah.lenguajes.ejercicio2.entities.Empleado;
import edu.unah.lenguajes.ejercicio2.entities.HistoricoPagos;
import edu.unah.lenguajes.ejercicio2.services.servicesImpl.EmpleadoServiceImpl;


@RestController
@RequestMapping("/api")
public class EmpleadoController {

  @Autowired
  private EmpleadoServiceImpl empleadoService;  

  @PostMapping("/empleado/crear")
  public Empleado createEmpleado(@RequestBody Empleado empleado) {
    return this.empleadoService.createEmpleado(empleado);
  }

  @DeleteMapping("/empleado/eliminar/{dni}")
  public String deleteEmpleado(@PathVariable String dni) {
    return this.empleadoService.deleteEmpleado(dni);
  }

  @GetMapping("/empleado/{dni}")
  public Empleado getHistorialDeEmpleado(@PathVariable String dni) {
    return this.empleadoService.searchEmpleado(dni);
  }
  
  @GetMapping("/empleados")
  public List<Empleado> getEmpleados() {
    return this.empleadoService.getAllEmpleado();
  }

  @PostMapping("/empleado/fecha")
  public List<HistoricoPagos> getPagosDeEmpleado(@RequestBody Pagos pago) {
    return this.empleadoService.getPagosEnFechaDada(pago);
  }

  @PostMapping("/pagos/crear")
  public HistoricoPagos createPago (@RequestBody PagoEmpleado pago) {
    return this.empleadoService.createPago(pago);   
  }
  

}
