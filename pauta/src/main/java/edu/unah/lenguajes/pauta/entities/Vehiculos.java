package edu.unah.lenguajes.pauta.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
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
@Table(name="vehiculo")
@Data
public class Vehiculos {
  @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="idvehiculo")
  private int idVehiculo; 

  private String marca;
  private int anio;
  private boolean disponible;

  @JoinColumn(name="idtipovehiculo", referencedColumnName="idtipovehiculo")
  @JsonBackReference
  @ManyToOne(cascade = CascadeType.ALL)
  private TipoVehiculo tipoVehiculo;

}
