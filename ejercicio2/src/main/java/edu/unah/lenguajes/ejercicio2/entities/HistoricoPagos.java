package edu.unah.lenguajes.ejercicio2.entities;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="pagoshistorial")
@Data
public class HistoricoPagos {

  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="historialid")
  private int historialId;
  
  @Column(name="fechapago")
  private LocalDate fechaPago;

  @Column(name="horastrabajadas")
  private int horasTrabajadas;

  @Column(name="precioporhora")
  private float precioPorHora;

  @Column(name="sueldototal")
  private float sueldoTotal;

  @JsonBackReference
  @ManyToOne
  @JoinColumn(name="dni", referencedColumnName="dni")
  private Empleado empleado;

  @Override
  public String toString() {
    return "{ " + this.historialId + "," + this.fechaPago + " }";
  }
}
