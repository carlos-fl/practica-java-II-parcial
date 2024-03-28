package edu.unah.lenguajes.ejercicio2.services;

import java.util.List;

import edu.unah.lenguajes.ejercicio2.dto.PagoEmpleado;
import edu.unah.lenguajes.ejercicio2.dto.Pagos;
import edu.unah.lenguajes.ejercicio2.entities.Empleado;
import edu.unah.lenguajes.ejercicio2.entities.HistoricoPagos;

public interface EmpleadoService {
  public Empleado createEmpleado(Empleado empleado);

  public String deleteEmpleado(String dni);

  public Empleado searchEmpleado(String dni);

  public List<Empleado> getAllEmpleado();

  public List<HistoricoPagos> getPagosEnFechaDada(Pagos pago);

  public HistoricoPagos createPago(PagoEmpleado pago);
}
