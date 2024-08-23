package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Sala {
    private int numero;
    private int capacidad;
    private List<Asiento> listaAsientos;

    public Sala(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.listaAsientos = new ArrayList<>();

        for (int fila = 1; fila <= capacidad / 10; fila++) { // Ejemplo: 10 asientos por fila
            for (int columna = 1; columna <= 10; columna++) {
                listaAsientos.add(new Asiento(fila, columna));
            }
        }
    }

    public int obtenerNumero() {
        return numero;
    }

    public int obtenerCapacidad() {
        return capacidad;
    }

    public Asiento obtenerAsiento(int fila, int columna) {
        for (Asiento asiento : listaAsientos) {
            if (asiento.obtenerFila() == fila && asiento.obtenerColumna() == columna) {
                return asiento;
            }
        }
        return null;
    }
}

