package sofka.vehiculo.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.vehiculo.values.Capacidad;
import sofka.vehiculo.values.Kilometraje;
import sofka.vehiculo.values.NumeroMotor;
import sofka.vehiculo.values.Tipo;

public class VehiculoAgregado extends DomainEvent {
    private final Tipo tipo;
    private final NumeroMotor numeroMotor;
    private final Kilometraje kilometraje;
    private final Capacidad capacidad;
    public VehiculoAgregado(Tipo tipo, NumeroMotor numeroMotor, Kilometraje kilometraje, Capacidad capacidad) {
        super("sofka.vehiculo.events.VehiculoAgregado");
        this.tipo = tipo;
        this.numeroMotor = numeroMotor;
        this.kilometraje = kilometraje;
        this.capacidad = capacidad;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public NumeroMotor getNumeroMotor() {
        return numeroMotor;
    }

    public Kilometraje getKilometraje() {
        return kilometraje;
    }

    public Capacidad getCapacidad() {
        return capacidad;
    }
}
