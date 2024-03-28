package edu.unah.lenguajes.ejercicio2.dto;

import lombok.Data;

@Data
public class PagoEmpleado {
  private String idEmpleado;
  private int horasTrabajadas;
  private int precioPorHora;
}
