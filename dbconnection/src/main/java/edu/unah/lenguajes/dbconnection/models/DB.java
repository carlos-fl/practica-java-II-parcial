package edu.unah.lenguajes.dbconnection.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="db")
@Data
public class DB {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String nombre;
}
