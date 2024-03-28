package edu.unah.lenguajes.ejercicio2.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Pagos {
  private String idEmpleado;

  private LocalDate fechaInicio;

  private LocalDate fechaFin;

  @Override
  public String toString() {
    return "{ " + this.idEmpleado + ", " + this.fechaInicio + ", " + this.fechaFin + " }"; 
  }
}
