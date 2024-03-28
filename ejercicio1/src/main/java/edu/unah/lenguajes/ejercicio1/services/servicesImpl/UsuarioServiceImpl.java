package edu.unah.lenguajes.ejercicio1.services.servicesImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unah.lenguajes.ejercicio1.models.Usuarios;
import edu.unah.lenguajes.ejercicio1.repositories.UsuarioRepository;
import edu.unah.lenguajes.ejercicio1.services.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

  @Autowired
  UsuarioRepository usuarioRepo;

  @Override
  public Usuarios createUsuario(Usuarios usuario) {
    return this.usuarioRepo.save(usuario);
  }

  @Override
  public String deleteUsuario(String id) {
    try {
      Usuarios usuario = this.usuarioRepo.findById(id).get();
      this.usuarioRepo.delete(usuario);
      return "usuario " + usuario.getCodigoUsuario() + " eliminado";
    } catch(Exception e) {
      return "usuario no encontrado";
    }
  }

  @Override
  public ArrayList<Usuarios> getUsuarios() {
    return (ArrayList<Usuarios>) this.usuarioRepo.findAll();
  }

  @Override
  public Usuarios getUsuario(String id) {
    return this.usuarioRepo.findById(id).get();
  }
  
}
