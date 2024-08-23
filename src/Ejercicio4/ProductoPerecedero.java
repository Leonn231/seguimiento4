package Ejercicio4;

import java.time.LocalDate;

public class ProductoPerecedero extends Producto {
    private LocalDate fechaVencimiento;

    public ProductoPerecedero(String nombre, String descripcion, double precio, int stock, LocalDate fechaVencimiento) {
        super(nombre, descripcion, precio, stock);
        this.fechaVencimiento = fechaVencimiento;
    }

    public LocalDate obtenerFechaVencimiento() {
        return fechaVencimiento;
    }

    public void modificarFechaVencimiento(LocalDate nuevaFechaVencimiento) {
        this.fechaVencimiento = nuevaFechaVencimiento;
    }
}
