package Ejercicio2;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        Sala sala1 = new Sala(1, 50); // 50 asientos en la sala
        Funcion funcion1 = new Funcion("Inception", "10:00", sala1, 7.50);


        Cliente cliente1 = new Cliente("Miguel Bedoya", "123456789", "Calle 2310");


        List<Asiento> asientosSeleccionados = new ArrayList<>();
        Asiento asiento1 = sala1.obtenerAsiento(1, 1);
        Asiento asiento2 = sala1.obtenerAsiento(1, 2);


        if (asiento1 != null && asiento2 != null) {
            asiento1.reservar();
            asiento2.reservar();
            asientosSeleccionados.add(asiento1);
            asientosSeleccionados.add(asiento2);


            Reserva reserva1 = new Reserva(cliente1, funcion1, asientosSeleccionados);
            System.out.println("Reserva realizada para: " + cliente1.obtenerNombre());
            System.out.println("Película: " + funcion1.obtenerPelicula());
            System.out.println("Hora: " + funcion1.obtenerHoraInicio());
            System.out.println("Asientos: ");
            for (Asiento asiento : reserva1.obtenerListaAsientos()) {
                System.out.println("Fila " + asiento.obtenerFila() + " Columna " + asiento.obtenerColumna());
            }
        } else {
            System.out.println("No se pudieron reservar los asientos seleccionados.");
        }
    }
}

