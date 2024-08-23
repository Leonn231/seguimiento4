package Ejercicio2;

import java.util.List;

public class Reserva {
    private Cliente cliente;
    private Funcion funcion;
    private List<Asiento> listaAsientos;

    public Reserva(Cliente cliente, Funcion funcion, List<Asiento> listaAsientos) {
        this.cliente = cliente;
        this.funcion = funcion;
        this.listaAsientos = listaAsientos;

        cliente.agregarReserva(this);
    }

    public Cliente obtenerCliente() {
        return cliente;
    }

    public Funcion obtenerFuncion() {
        return funcion;
    }

    public List<Asiento> obtenerListaAsientos() {
        return listaAsientos;
    }
}

