package sofka.vehiculo;

import co.com.sofka.domain.generic.EventChange;
import sofka.vehiculo.events.VehiculoAgregado;

public class VehiculoEventChange extends EventChange {
    public VehiculoEventChange(Vehiculo vehiculo) {
        apply((VehiculoAgregado event) ->{
            vehiculo.tipo = event.getTipo();
            vehiculo.numeroMotor = event.getNumeroMotor();
            vehiculo.kilometraje = event.getKilometraje();
            vehiculo.capacidad = event.getCapacidad();

        }) ;
    }
}
