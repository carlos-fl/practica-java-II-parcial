package edu.unah.lenguajes.pruebaunomuchos.services.serviceImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unah.lenguajes.pruebaunomuchos.entities.Club;
import edu.unah.lenguajes.pruebaunomuchos.repositories.ClubRepository;
import edu.unah.lenguajes.pruebaunomuchos.services.ClubService;

@Service
public class ClubServiceImpl implements ClubService {

  @Autowired
  private ClubRepository clubRepo;

  @Override
  public Club createClub(Club club) {
    return this.clubRepo.save(club);
  }

  @Override
  public ArrayList<Club> showClubs() {
    return (ArrayList<Club>) this.clubRepo.findAll();
  }
  
}
