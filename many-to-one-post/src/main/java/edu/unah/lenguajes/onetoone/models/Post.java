package edu.unah.lenguajes.onetoone.models;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Post {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="id")
  private long id;

  @Column(name="title")
  private String title;
  
  @Column(name="descripcion")
  private String descripcion;
}
