package edu.unah.lenguajes.ejercicio2.services.servicesImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unah.lenguajes.ejercicio2.dto.PagoEmpleado;
import edu.unah.lenguajes.ejercicio2.dto.Pagos;
import edu.unah.lenguajes.ejercicio2.entities.Empleado;
import edu.unah.lenguajes.ejercicio2.entities.HistoricoPagos;
import edu.unah.lenguajes.ejercicio2.repositories.EmpleadoRepository;
import edu.unah.lenguajes.ejercicio2.repositories.HistoricoPagosRepository;
import edu.unah.lenguajes.ejercicio2.services.EmpleadoService;
import edu.unah.lenguajes.ejercicio2.util.DateValidator;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

  @Autowired
  private EmpleadoRepository empleadoRepo;

  @Autowired
  private HistoricoPagosRepository historicoPagosRepo;

  @Override
  public Empleado createEmpleado(Empleado empleado) {
    return this.empleadoRepo.save(empleado);
  }

  @Override
  public String deleteEmpleado(String dni) {
    try {
      Empleado empleado = this.empleadoRepo.findById(dni).get();
      this.empleadoRepo.delete(empleado);
      return "empleado con dni " + empleado.getDni() + " ha sido eliminado";
    } catch(Error e) {
      return "Empleado not found";
    }
  }

  @Override
  public Empleado searchEmpleado(String dni) {
    try {
      Empleado empleado = this.empleadoRepo.findById(dni).get();
      return empleado;
    } catch(Error e) {
      return null;
    }
  }

  @Override
  public List<Empleado> getAllEmpleado() {
    return (List<Empleado>) this.empleadoRepo.findAll();
  }

  @Override
  public ArrayList<HistoricoPagos> getPagosEnFechaDada(Pagos pago) {
    
    Empleado empleado = this.empleadoRepo.findById(pago.getIdEmpleado()).get();
    List<HistoricoPagos> pagos = empleado.getHistorial();
    ArrayList<HistoricoPagos> pagosEnFecha = new ArrayList<>();
    for (HistoricoPagos p : pagos) {
      if (DateValidator.isValidDate(pago.getFechaInicio(), pago.getFechaFin(), p.getFechaPago())) {
        pagosEnFecha.add(p);
      }
    }
    return pagosEnFecha;
  }

  @Override
  public HistoricoPagos createPago(PagoEmpleado pago) {
    if (pago.getHorasTrabajadas() < 0 || pago.getPrecioPorHora() <= 0 || !empleadoRepo.existsById(pago.getIdEmpleado())) 
      return null;
    
    HistoricoPagos pagoEnviado = new HistoricoPagos();
    pagoEnviado.setFechaPago(LocalDate.now()); 
    pagoEnviado.setHorasTrabajadas(pago.getHorasTrabajadas());
    pagoEnviado.setPrecioPorHora(pago.getPrecioPorHora());
    pagoEnviado.setSueldoTotal(pago.getHorasTrabajadas() * pago.getPrecioPorHora());
    pagoEnviado.setEmpleado(this.empleadoRepo.findById(pago.getIdEmpleado()).get());
    HistoricoPagos pagoDone = this.historicoPagosRepo.save(pagoEnviado);
    return pagoDone;
  }
}
