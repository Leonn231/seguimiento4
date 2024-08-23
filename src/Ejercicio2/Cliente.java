package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona {
    private List<Reserva> historialReservas;

    public Cliente(String nombre, String identificacion, String direccion) {
        super(nombre, identificacion, direccion);
        this.historialReservas = new ArrayList<>();
    }

    public List<Reserva> obtenerHistorialReservas() {
        return historialReservas;
    }

    public void agregarReserva(Reserva reserva) {
        historialReservas.add(reserva);
    }
}

