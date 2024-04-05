package edu.unah.lenguajes.pauta.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="reserva")
@Data
public class Reserva {
  @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="idreserva")
  private int idReserva; 

  private int idCliente;

  @Column(name="idvehiculo")
  private int idVehiculo;

  private LocalDate fecha;
  private int dias;
  private double total;
}
