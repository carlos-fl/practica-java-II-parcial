package edu.unah.lenguajes.football.services;

import java.util.ArrayList;

import edu.unah.lenguajes.football.entities.Club;

public interface ClubService {
  public Club getClub(int id);
  
  public ArrayList<Club> getClubs();

  public Club createClub(Club club);

  public Club updateClub(int id, int championswon, int coachId);

  public String deleteClub(int clubId);
}
