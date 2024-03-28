package edu.unah.lenguajes.empleados.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="direccion")
@Data
public class Direccion {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="addressid")
  private int addressId; 

  private String calle;
  private String ciudad;
  private String estado;

  @OneToOne(mappedBy = "direccionId")
  private Empleado empleado;
}
