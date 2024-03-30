package edu.unah.lenguajes.ejercicio3.services;

import edu.unah.lenguajes.ejercicio3.entities.Abonado;

public interface AbonadoService {
  public Abonado createAbonado(Abonado abonado);

  public Abonado getAbonado(String dni);

  public String deleteAbonado(String dni);

  
}
