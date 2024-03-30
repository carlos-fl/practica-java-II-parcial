package edu.unah.lenguajes.ejercicio3.services.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unah.lenguajes.ejercicio3.entities.Abonado;
import edu.unah.lenguajes.ejercicio3.repositories.AbonadoRepository;
import edu.unah.lenguajes.ejercicio3.services.AbonadoService;

@Service
public class AbonadoServiceImpl implements AbonadoService {

  @Autowired
  private AbonadoRepository abonadoRepo;

  @Override
  public Abonado createAbonado(Abonado abonado) {
    return this.abonadoRepo.save(abonado);
  }

  @Override
  public Abonado getAbonado(String dni) {
    if (this.abonadoRepo.existsById(dni))
      return this.abonadoRepo.findById(dni).get();
    
    return null;
  }

  @Override
  public String deleteAbonado(String dni) {
    if (this.abonadoRepo.existsById(dni)) {
      Abonado abonado = this.abonadoRepo.findById(dni).get();
      this.abonadoRepo.delete(abonado);
      return "abonado con dni: " + abonado.getDni() + " ha sido eliminado";
    }

    return "abonado no encontrado";
  }
  
}
