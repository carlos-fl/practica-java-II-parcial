package edu.unah.lenguajes.dbconnection.services;

import java.util.ArrayList;

import edu.unah.lenguajes.dbconnection.models.DB;

public interface DbServices {
  public ArrayList<DB> getAllDB();

  public DB addDb(DB db);
}
