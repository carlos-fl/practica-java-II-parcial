package edu.unah.lenguajes.dbconnection.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unah.lenguajes.dbconnection.models.DB;

public interface DbRepository extends JpaRepository<DB, Integer> {
   
}
