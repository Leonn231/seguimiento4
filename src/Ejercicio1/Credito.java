package Ejercicio1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Credito {
    private List<Ejercicio1.SolicitudCredito> creditos;
    private String estado;

    public Credito(List<Ejercicio1.SolicitudCredito> creditos, String estado) {
        this.creditos = new ArrayList<>();
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void addCredito(Ejercicio1.SolicitudCredito Credito) {
        creditos.add(Credito);
    }

    public List<Ejercicio1.SolicitudCredito> getSolicitudCredito() {
        return creditos;
    }
    public void obtenerEstado() {
        if (estado == "aprobado") {
            JOptionPane.showMessageDialog(null, "Su solicitud de credito es: "  + '\n' + getSolicitudCredito() + '\n' + "su credito esta aprobado");
        } else if (estado == "rechazado") {
            JOptionPane.showMessageDialog(null, "Su solicitud de credito es: "  +'\n' + getSolicitudCredito() + '\n' + "su credito esta rechazado");
        } else if (estado == "pendiente") {
            JOptionPane.showMessageDialog(null, "Su solicitud de credito es: "  +'\n' + getSolicitudCredito() + '\n' + "su credito esta pendiente");
        }
    }
    public void aprobar(){
        estado = "aprobado";
    }
    public void rechazar(){
        estado = "rechazado";
    }
}
