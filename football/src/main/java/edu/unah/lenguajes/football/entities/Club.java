package edu.unah.lenguajes.football.entities;

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
@Table(name="club")
@Data
public class Club {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="clubid")
  private int clubId;

  private String name;
  private String league;

  @Column(name="championswon")
  private int championsWon;

  @JoinColumn(name="coachid", referencedColumnName="coachid")
  @OneToOne(cascade = CascadeType.ALL)
  private Coach coach;
}
