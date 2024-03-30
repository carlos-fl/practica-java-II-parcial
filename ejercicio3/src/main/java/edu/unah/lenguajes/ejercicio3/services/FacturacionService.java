package edu.unah.lenguajes.ejercicio3.services;

import edu.unah.lenguajes.ejercicio3.dto.FacturacionDto;
import edu.unah.lenguajes.ejercicio3.entities.Facturacion;
public interface FacturacionService {
  public Facturacion createFacturacion(FacturacionDto facturacion);  
}
