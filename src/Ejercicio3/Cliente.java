package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona {
    private List<Boleto> historialCompras;

    public Cliente(String nombre, String identificacion, String direccion) {
        super(nombre, identificacion, direccion);
        this.historialCompras = new ArrayList<>();
    }

    public List<Boleto> obtenerHistorialCompras() {
        return historialCompras;
    }

    public void agregarCompra(Boleto boleto) {
        historialCompras.add(boleto);
    }
}

