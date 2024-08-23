package Ejercicio5;

import java.time.LocalDate;
import java.time.LocalTime;

public class Vuelo {
    private String numero;
    private String ruta;
    private LocalDate fecha;
    private LocalTime horaSalida;
    private LocalTime horaLlegada;
    private Avion avion;

    public Vuelo(String numero, String ruta, LocalDate fecha, LocalTime horaSalida, LocalTime horaLlegada, Avion avion) {
        this.numero = numero;
        this.ruta = ruta;
        this.fecha = fecha;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.avion = avion;
    }

    public String obtenerNumero() {
        return numero;
    }

    public String obtenerRuta() {
        return ruta;
    }

    public LocalDate obtenerFecha() {
        return fecha;
    }

    public LocalTime obtenerHoraSalida() {
        return horaSalida;
    }

    public LocalTime obtenerHoraLlegada() {
        return horaLlegada;
    }

    public Avion obtenerAvion() {
        return avion;
    }
}

