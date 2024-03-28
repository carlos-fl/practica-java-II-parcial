package edu.unah.lenguajes.dbconnection.services.servicesImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unah.lenguajes.dbconnection.models.DB;
import edu.unah.lenguajes.dbconnection.repositories.DbRepository;
import edu.unah.lenguajes.dbconnection.services.DbServices;

@Service
public class DbServicesImpl implements DbServices {

  @Autowired
  DbRepository dbRepository;

  @Override
  public ArrayList<DB> getAllDB() {
    return (ArrayList<DB>) this.dbRepository.findAll(); 
  }

  @Override
  public DB addDb(DB db) {
    return this.dbRepository.save(db);
  }
  
}
