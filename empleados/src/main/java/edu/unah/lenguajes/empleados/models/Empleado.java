package edu.unah.lenguajes.empleados.models;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="empleado")
@Data
public class Empleado {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="empleadoid")
  private int empleadoId;

  private String nombre;
  private String apellido;

  @OneToOne(targetEntity=Direccion.class, cascade=CascadeType.ALL)
  @JoinColumn(name="direccionid", referencedColumnName = "addressId")
  private Direccion direccionId;
}
