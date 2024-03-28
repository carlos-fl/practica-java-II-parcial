package edu.unah.lenguajes.ejercicio1.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="perfil")
@Data
public class Perfil {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="idperfil")
  private int idPerfil;

  private String rol;
  private String descripcion;

  @OneToOne(mappedBy = "perfil")
  @JsonIgnore
  private Usuarios usuario;
}
