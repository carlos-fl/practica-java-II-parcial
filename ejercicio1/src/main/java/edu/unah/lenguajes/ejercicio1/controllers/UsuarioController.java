package edu.unah.lenguajes.ejercicio1.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.unah.lenguajes.ejercicio1.models.Usuarios;
import edu.unah.lenguajes.ejercicio1.services.servicesImpl.UsuarioServiceImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/api")
public class UsuarioController {

  @Autowired
  UsuarioServiceImpl usuarioService;

  @PostMapping("/usuarios/create")
  public Usuarios createUsuario(@RequestBody Usuarios usuario) {
    return this.usuarioService.createUsuario(usuario); 
  }

  @DeleteMapping("/usuarios/delete/{id}")
  public String deleteUsuario(@PathVariable String id) {
    return this.usuarioService.deleteUsuario((id));
  }

  @GetMapping("/usuarios")
  public ArrayList<Usuarios> getMethodName() {
    return this.usuarioService.getUsuarios();
  }

  @GetMapping("/usuarios/{id}")
  public Usuarios getUsuario(@PathVariable String id) {
    return this.usuarioService.getUsuario(id);
  }

  
  
   
}
