package edu.unah.lenguajes.ejercicio3.entities;

import java.time.LocalDate;

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
@Table(name="facturacion")
@Data
public class Facturacion {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="idfacturacion")
  private int idFacturacion;

  @Column(name="fechafacturacion")
  private LocalDate fechaFacturacion;

  @JoinColumn(name="dni", referencedColumnName="dni")
  @ManyToOne
  private Abonado abonado;

  @Column(name="kwsconsumidos")
  private double KwsConsumidos;

  @Column(name="totalfacturacion")
  private double totalFacturacion;
}
