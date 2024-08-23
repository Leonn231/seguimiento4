package Ejercicio4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SistemaGestionProductos {
    private List<Producto> listaProductos;

    public SistemaGestionProductos() {
        this.listaProductos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        listaProductos.add(producto);
    }

    public void eliminarProducto(String nombre) {
        listaProductos.removeIf(producto -> producto.obtenerNombre().equals(nombre));
    }

    public Producto buscarProducto(String nombre) {
        for (Producto producto : listaProductos) {
            if (producto.obtenerNombre().equals(nombre)) {
                return producto;
            }
        }
        return null;
    }

    public void modificarProducto(String nombre, double nuevoPrecio, int nuevoStock) {
        Producto producto = buscarProducto(nombre);
        if (producto != null) {
            producto.modificarPrecio(nuevoPrecio);
            producto.modificarStock(nuevoStock);
        }
    }

    public void mostrarProductos() {
        for (Producto producto : listaProductos) {
            System.out.println("Nombre: " + producto.obtenerNombre());
            System.out.println("Descripción: " + producto.obtenerDescripcion());
            System.out.println("Precio: $" + producto.obtenerPrecio());
            System.out.println("Stock: " + producto.obtenerStock());
            if (producto instanceof ProductoPerecedero) {
                System.out.println("Fecha de Vencimiento: " + ((ProductoPerecedero) producto).obtenerFechaVencimiento());
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SistemaGestionProductos sistema = new SistemaGestionProductos();

        Producto producto1 = new Producto("Laptop", "Laptop de 15 pulgadas", 1000.0, 10);
        ProductoPerecedero producto2 = new ProductoPerecedero("Leche", "Leche entera", 1.50, 100, LocalDate.of(2024, 10, 1));

        sistema.agregarProducto(producto1);
        sistema.agregarProducto(producto2);

        sistema.mostrarProductos();

        sistema.modificarProducto("Laptop", 950.0, 8);
        sistema.eliminarProducto("Leche");

        sistema.mostrarProductos();
    }
}

