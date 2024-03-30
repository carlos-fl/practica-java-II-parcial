package edu.unah.lenguajes.ejercicio3.services.servicesImpl;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unah.lenguajes.ejercicio3.dto.FacturacionDto;
import edu.unah.lenguajes.ejercicio3.entities.Abonado;
import edu.unah.lenguajes.ejercicio3.entities.Facturacion;
import edu.unah.lenguajes.ejercicio3.repositories.AbonadoRepository;
import edu.unah.lenguajes.ejercicio3.repositories.FacturacionRepository;
import edu.unah.lenguajes.ejercicio3.repositories.TiposResidenciaRepository;
import edu.unah.lenguajes.ejercicio3.services.FacturacionService;

@Service
public class FacturacionServiceImpl implements FacturacionService {

  @Autowired
  private FacturacionRepository facturacionRepo;

  @Autowired
  private AbonadoRepository abonadoRepo;

  @Autowired
  private TiposResidenciaRepository tiposResidenciaRepo;

  @Override
  public Facturacion createFacturacion(FacturacionDto facturacion) {
    if (!this.abonadoRepo.existsById(facturacion.getDni()))
      return null;
    
    Facturacion factura = new Facturacion();
    Abonado abonado = this.abonadoRepo.findById(facturacion.getDni()).get();
    double preciokw = this.tiposResidenciaRepo.findById(abonado.getTiposResidencia().getIdTipoResidencia()).get().getPrecioKw();
    factura.setFechaFacturacion(LocalDate.now());
    factura.setAbonado(abonado);
    factura.setKwsConsumidos(facturacion.getKwConsumido());
    factura.setTotalFacturacion(facturacion.getKwConsumido() * preciokw);
    return this.facturacionRepo.save(factura);
  }
  
}
