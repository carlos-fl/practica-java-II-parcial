package edu.unah.lenguajes.football.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="coach")
@Data
public class Coach {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="coachid")
  private int coachId; 

  private String name;
  private int age;

  @OneToOne(mappedBy = "coach")
  private Club club;
}
