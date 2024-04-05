package edu.unah.lenguajes.pauta.services.servicesImpl;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unah.lenguajes.pauta.entities.Reserva;
import edu.unah.lenguajes.pauta.entities.TipoVehiculo;
import edu.unah.lenguajes.pauta.entities.Vehiculos;
import edu.unah.lenguajes.pauta.repositories.ClienteRepository;
import edu.unah.lenguajes.pauta.repositories.ReservaRepository;
import edu.unah.lenguajes.pauta.repositories.TipoVehiculoRepository;
import edu.unah.lenguajes.pauta.repositories.VehiculosRepository;
import edu.unah.lenguajes.pauta.services.ReservaService;

@Service
public class ReservaServiceImpl implements ReservaService {

  @Autowired
  private ReservaRepository reservaRepo;

  @Autowired
  private ClienteRepository clienteRepo;

  @Autowired
  private VehiculosRepository vehiculoRepo;

  @Autowired
  private TipoVehiculoRepository tipoVehiculoRepo;

  @Override
  public String createReserva(int idCliente, int idVehiculo, int dias) {
    if (!this.clienteRepo.existsById(idCliente))
      return "No se ha encontrado el cliente, verifique el id del cliente";
    if (!this.vehiculoRepo.existsById(idVehiculo))
      return "No se ha encontrado el vehiculo, verifique el id del vehiculo";

    Vehiculos vehiculo = this.vehiculoRepo.findById(idVehiculo).get(); 
    if (!vehiculo.isDisponible())
      return "Vehiculo no se encuentra disponible";

    vehiculo.setDisponible(false);
    this.vehiculoRepo.save(vehiculo);

    TipoVehiculo tipoVehiculo = this.tipoVehiculoRepo.findById(vehiculo.getTipoVehiculo().getIdTipoVehiculo()).get();
    double total = tipoVehiculo.getPrecioXHora() * dias;

    Reserva reserva = new Reserva();
    reserva.setDias(dias);
    reserva.setFecha(LocalDate.now());
    reserva.setIdCliente(idCliente);
    reserva.setIdVehiculo(idVehiculo);
    reserva.setTotal(total);

    this.reservaRepo.save(reserva);

    return "La reserva se ha creado con exito";
  }
  
}
