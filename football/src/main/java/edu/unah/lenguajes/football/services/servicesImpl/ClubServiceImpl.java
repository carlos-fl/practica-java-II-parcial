package edu.unah.lenguajes.football.services.servicesImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unah.lenguajes.football.entities.Club;
import edu.unah.lenguajes.football.entities.Coach;
import edu.unah.lenguajes.football.repositories.ClubRepository;
import edu.unah.lenguajes.football.repositories.CoachRepository;
import edu.unah.lenguajes.football.services.ClubService;

@Service
public class ClubServiceImpl implements ClubService {

  @Autowired
  ClubRepository clubRepo;

  @Autowired
  CoachRepository coachRepo;

  @Override
  public Club getClub(int id) {
    return this.clubRepo.findById(id).get();
  }

  @Override
  public ArrayList<Club> getClubs() {
    return (ArrayList<Club>) this.clubRepo.findAll();
  }

  @Override
  public Club createClub(Club club) {
    return this.clubRepo.save(club);
  }

  @Override
  public Club updateClub(int id, int championswon, int coachId) {
    Club club = this.clubRepo.findById(id).get();
    if (club != null) {
      club.setChampionsWon(championswon);
      Coach coach = this.coachRepo.findById(coachId).get();
      club.setCoach(coach);
      return this.clubRepo.save(club);  
    }
    return null;
  }

  @Override
  public String deleteClub(int clubId) {
    Club club = this.clubRepo.findById(clubId).get();
    if (club != null) {
      this.clubRepo.delete(club);
      return "club " + club.getName() + " ha sido eliminado de la liga";
    }
    return "club no ha sido encontrado";
  }
  
}
