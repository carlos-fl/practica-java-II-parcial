package edu.unah.lenguajes.pruebaunomuchos.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;

//import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="club")
@Data
public class Club {
  @Id
  private String id;
  
  private String liga;
  private String nombre;
  
  @JsonManagedReference
  @OneToMany(mappedBy="club", cascade = CascadeType.ALL)
  private List<Player> players;
}
