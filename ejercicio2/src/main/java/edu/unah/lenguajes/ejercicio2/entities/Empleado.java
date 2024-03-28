package edu.unah.lenguajes.ejercicio2.entities;

import java.util.List;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="empleado")
@Data
public class Empleado {
  @Id
  private String dni;

  private String nombre;
  private String apellido;

  @Column(name="fechaingreso")
  private LocalDate fechaIngreso;

  @JsonManagedReference
  @OneToMany(mappedBy = "empleado", cascade = CascadeType.ALL)
  private List<HistoricoPagos> historial;

  @Override
  public String toString() {
    return "{ " + this.dni + "," + this.nombre + "," + this.apellido + "," + this.fechaIngreso + "," + this.historial + " }";
  }
}
