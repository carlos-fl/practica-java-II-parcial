package edu.unah.lenguajes.football.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.unah.lenguajes.football.entities.Club;
import edu.unah.lenguajes.football.services.servicesImpl.ClubServiceImpl;

@RestController
@RequestMapping("/api")
public class ClubController {
  
  @Autowired
  private ClubServiceImpl clubService;

  @GetMapping("/clubs")
  public ArrayList<Club> getClubs() {
    return this.clubService.getClubs();
  }

  @GetMapping("/clubs/{id}")
  public Club getClub(@PathVariable int id) {
    return this.clubService.getClub(id);
  }

  @PostMapping("/clubs/create")
  public Club createClub(@RequestBody Club club) {
    return this.clubService.createClub(club);
  }
}
