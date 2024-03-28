package edu.unah.lenguajes.pruebaunomuchos.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="player")
@Data
public class Player {
  @Id
  private String id;

  private int edad;
  private String nombre;

  @JoinColumn(name="clubid", referencedColumnName="id")
  @JsonBackReference
  @ManyToOne
  private Club club;
}
