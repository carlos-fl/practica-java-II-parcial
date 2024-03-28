package edu.unah.lenguajes.dbconnection.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.unah.lenguajes.dbconnection.models.DB;
import edu.unah.lenguajes.dbconnection.services.servicesImpl.DbServicesImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api")
public class DbController {

  @Autowired
  DbServicesImpl dbService;

  @GetMapping("/dbs")
  public ArrayList<DB> getDbs() {
    return this.dbService.getAllDB();
  }

  @PostMapping("/dbs/agregar")
  public DB addDbs(@RequestBody DB db) {
    return this.dbService.addDb(db);
  }
  
  
}
