package Ejercicio1;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static <Cliente, Persona, SolicitudCredito> void main(String[] args) {
        Persona pr = new Persona("",0,"");
        Cliente cl = new Cliente("",0,"", "",2000);

        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("",0,"","",0));
        clientes.add(new Cliente("",0,"","",0));

        Ejercicio1.SolicitudCredito sc = new SolicitudCredito(clientes,"",100000,"3 meses",0.3);

        ArrayList<SolicitudCredito> solicitudCreditos = new ArrayList<>();
        solicitudCreditos.add(sc);

        Ejercicio1.Credito cr = new Ejercicio1.Credito(solicitudCreditos,"aprobado");

        Ejercicio1.Inmueble in = new Ejercicio1.Inmueble("","");
        CreditoHipotecario ch = new CreditoHipotecario(solicitudCreditos,"",in);

        JOptionPane.showMessageDialog(null,"Bienvenido al banco","Banco",JOptionPane.INFORMATION_MESSAGE);
        boolean continuar = true;
        while (continuar) {
            String[] opciones = {
                    "Registrar Persona",
                    "mi usuario",
                    "Registrar Ingreso",
                    "Solicitar credito",
                    "Ver Solicitud del Credito",
                    "Consultar estado credito",
                    "añadir propieada",
                    "Ver propiedad",
                    "Salir"
            };

            String seleccion = (String) JOptionPane.showInputDialog(
                    null,
                    "Seleccione una opción",
                    "Banco",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]
            );

            if (seleccion != null) {
                switch (seleccion) {
                    case "Registrar Persona" :
                        pr.getClass();
                        break;
                        case "Mostrar mi usuario" :
                        pr.clone();
                        break;
                    case "Registrar Ingreso":
                        pr.toString();
                        break;
                    case "Solicitar credito":
                        sc.obtenerTipoCredito();
                        break;
                    case "Mostrar Solicitud de Credito":
                        sc.mostrarMiSolicitudCredito();
                        break;
                    case "Consultar estado credito":
                        cr.obtenerEstado();
                        break;
                    case "añadir propieada":
                        in.añadirDireccion();
                        break;
                    case "Ver propiedad":
                        in.mostratPropiedad();
                        break;
                    case "Salir":

                        break;
                }
            } else {
                continuar = false;
            }
        }

    }
}
