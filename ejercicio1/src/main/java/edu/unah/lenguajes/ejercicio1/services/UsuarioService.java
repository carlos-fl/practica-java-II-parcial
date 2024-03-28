package edu.unah.lenguajes.ejercicio1.services;

import java.util.ArrayList;

import edu.unah.lenguajes.ejercicio1.models.Usuarios;

public interface UsuarioService {
  public Usuarios createUsuario(Usuarios usuario);
  public String deleteUsuario(String id);
  public ArrayList<Usuarios> getUsuarios();
  public Usuarios getUsuario(String id);
}
