package sofka.vehiculo;

import co.com.sofka.domain.generic.AggregateEvent;
import sofka.vehiculo.events.VehiculoAgregado;
import sofka.vehiculo.values.*;

public class Vehiculo extends AggregateEvent<placaVeh> {

    protected Tipo tipo;

    protected Linea linea;

    protected NumeroMotor numeroMotor;

    protected Kilometraje kilometraje;

    protected Capacidad capacidad;

    protected Disponibilidad disponibilidad;


    public Vehiculo(placaVeh entityId, Tipo tipo, NumeroMotor numeroMotor, Kilometraje kilometraje, Capacidad capacidad) {

        super(entityId);

        appendChange(new VehiculoAgregado(tipo,numeroMotor,kilometraje,capacidad)).apply();
        subscribe(new VehiculoEventChange(this));
    }
}
