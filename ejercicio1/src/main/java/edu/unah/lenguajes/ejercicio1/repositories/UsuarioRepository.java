package edu.unah.lenguajes.ejercicio1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unah.lenguajes.ejercicio1.models.Usuarios;

public interface UsuarioRepository extends JpaRepository<Usuarios, String> {
  
}
