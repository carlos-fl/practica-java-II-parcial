package edu.unah.lenguajes.pauta.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="tipocliente")
@Data
public class TipoCliente {
  @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="idtipocliente")
  private int idTipoCliente; 

  private String descripcion;

  @OneToMany(mappedBy="tipoCliente")
  @JsonManagedReference
  private List<Cliente> cliente;
}
