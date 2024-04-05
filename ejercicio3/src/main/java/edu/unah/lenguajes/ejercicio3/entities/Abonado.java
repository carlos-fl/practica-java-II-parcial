package edu.unah.lenguajes.ejercicio3.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="abonado")
@Data
public class Abonado {
  @Id
  private String dni; 

  private String nombre;
  private String apellido;
  private String telefono;

  @JsonBackReference
  @JoinColumn(name="idtiporesidencia", referencedColumnName="idtiporesidencia")
  @ManyToOne
  private TiposResidencia tiposResidencia;

  @OneToMany(mappedBy="abonado")
  private List<Facturacion> facturacion;
}
