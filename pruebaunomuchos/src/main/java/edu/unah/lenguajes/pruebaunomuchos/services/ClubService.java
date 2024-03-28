package edu.unah.lenguajes.pruebaunomuchos.services;

import java.util.ArrayList;

import edu.unah.lenguajes.pruebaunomuchos.entities.Club;

public interface ClubService {
  public Club createClub(Club club); 

  public ArrayList<Club> showClubs();
}
