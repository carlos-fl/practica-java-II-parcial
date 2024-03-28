package edu.unah.lenguajes.pruebaunomuchos.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.unah.lenguajes.pruebaunomuchos.entities.Club;
import edu.unah.lenguajes.pruebaunomuchos.services.serviceImpl.ClubServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api")
public class ClubController {
  @Autowired
  private ClubServiceImpl clubService;

  @PostMapping("/club/crear")
  public Club createClub(@RequestBody Club club) {
    return this.clubService.createClub(club);
  }

  @GetMapping("/clubs")
  public ArrayList<Club> getClubs() {
    return this.clubService.showClubs();
  }
  
  
}
