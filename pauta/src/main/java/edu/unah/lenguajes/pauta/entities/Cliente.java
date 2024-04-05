package edu.unah.lenguajes.pauta.entities;

import java.time.LocalDate;

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
@Table(name="cliente")
@Data
public class Cliente {
  @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="idcliente")
  private int idCliente; 

  private String nombre;
  private String apellido;

  @Column(name="fechaingreso")
  private LocalDate fechaIngreso;

  @JoinColumn(name="idtipocliente", referencedColumnName="idtipocliente")
  @JsonBackReference
  @ManyToOne(cascade = CascadeType.ALL)
  private TipoCliente tipoCliente;

}
