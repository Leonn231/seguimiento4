package Ejercicio3;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Tren tren1 = new Tren(101, "Madrid - Barcelona");
        Vagon vagon1 = new Vagon("Clase para pobres", 50);
        Vagon vagon2 = new Vagon("Clase Millonarios", 30);

        tren1.agregarVagon(vagon1);
        tren1.agregarVagon(vagon2);

        Viaje viaje1 = new Viaje("2024-010-01", "08:00", "12:00", tren1);

        Cliente cliente1 = new Cliente("Charlixqui", "987654321", "Avenida Los porros");

        Vagon vagonSeleccionado = tren1.obtenerVagon("Clase para pobres");
        Asiento asientoSeleccionado = vagonSeleccionado.obtenerAsiento(1);

        if (asientoSeleccionado != null) {
            asientoSeleccionado.reservar();
            Boleto boleto1 = new Boleto(cliente1, viaje1, asientoSeleccionado);

            System.out.println("Boleto comprado por: " + cliente1.obtenerNombre());
            System.out.println("Viaje: " + viaje1.obtenerTren().obtenerRuta());
            System.out.println("Fecha: " + viaje1.obtenerFecha() + " Hora de salida: " + viaje1.obtenerHoraSalida());
            System.out.println("Asiento: " + asientoSeleccionado.obtenerNumero() + " Estado: " + asientoSeleccionado.obtenerEstado());
        } else {
            System.out.println("No se pudo reservar el asiento seleccionado.");
        }
    }
}
