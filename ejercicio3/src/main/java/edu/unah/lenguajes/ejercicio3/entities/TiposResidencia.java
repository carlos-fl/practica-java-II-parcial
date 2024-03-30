package edu.unah.lenguajes.ejercicio3.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="tiposresidencia")
@Data
public class TiposResidencia {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="idtiporesidencia")
  private int idTipoResidencia;

  private String descripcion;
  
  @Column(name="preciokw")
  private double precioKw;

  @JsonManagedReference
  @OneToMany(cascade = CascadeType.ALL, mappedBy="tiposResidencia")
  private List<Abonado> abonado;
}
