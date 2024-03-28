package edu.unah.lenguajes.onetoone.models;

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
@Table(name="comment")
@Data
public class Comment {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="id")
  private long id;

  private String smg;

  @Column(name="postid")
  @OneToOne(mappedBy="comment")
  @JsonIgnore
  private long postId;
}
