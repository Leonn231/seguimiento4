package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Tren {
    private int numero;
    private String ruta;
    private List<Vagon> listaVagones;

    public Tren(int numero, String ruta) {
        this.numero = numero;
        this.ruta = ruta;
        this.listaVagones = new ArrayList<>();
    }

    public void agregarVagon(Vagon vagon) {
        listaVagones.add(vagon);
    }

    public int obtenerNumero() {
        return numero;
    }

    public String obtenerRuta() {
        return ruta;
    }

    public Vagon obtenerVagon(String tipo) {
        for (Vagon vagon : listaVagones) {
            if (vagon.obtenerTipo().equals(tipo)) {
                return vagon;
            }
        }
        return null;
    }
}