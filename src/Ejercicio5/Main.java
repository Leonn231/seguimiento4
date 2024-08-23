package Ejercicio5;
import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Avion avion1 = new Avion("Boeing 737", 180);

        Vuelo vuelo1 = new Vuelo("IB1235", "Necocli - Montenegro", LocalDate.of(2024, 9, 10), LocalTime.of(9, 0), LocalTime.of(10, 30), avion1);

        Pasajero pasajero1 = new Pasajero("Juan Pérez", "123456789", "juan.perez@example.com");

        Asiento asientoSeleccionado = avion1.obtenerAsiento(10);

        if (asientoSeleccionado != null && asientoSeleccionado.obtenerEstado().equals("disponible")) {
            asientoSeleccionado.reservar();
            Reserva reserva1 = new Reserva(pasajero1, vuelo1, asientoSeleccionado);

            System.out.println("Reserva realizada para: " + pasajero1.obtenerNombre());
            System.out.println("Vuelo: " + vuelo1.obtenerNumero() + " - " + vuelo1.obtenerRuta());
            System.out.println("Fecha: " + vuelo1.obtenerFecha());
            System.out.println("Hora de salida: " + vuelo1.obtenerHoraSalida());
            System.out.println("Asiento: " + asientoSeleccionado.obtenerNumero() + " - " + asientoSeleccionado.obtenerClase());
            System.out.println("Estado del asiento: " + asientoSeleccionado.obtenerEstado());
        } else {
            System.out.println("No se pudo reservar el asiento.");
        }
    }
}

