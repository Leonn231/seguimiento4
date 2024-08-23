package Ejercicio1;

import javax.swing.*;

public class Inmueble {
    private String direccion;
    private String valor;

    public Inmueble(String direccion, String valor) {
        this.direccion = "Cra 5 #15-92";
        this.valor = "2.000.000";
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    public void añadirDireccion(){
        String aDireccion = JOptionPane.showInputDialog(null,"ingrese la direccion de la propiedad: ");
        direccion = aDireccion;
        añadirValor();
    }
    public void añadirValor(){
        String aValor = JOptionPane.showInputDialog(null,"ingrese el valor de la propiedad: ");
        valor = aValor;
        mostratPropiedad();
    }
    public void mostratPropiedad(){
        JOptionPane.showMessageDialog(null,"su propiedad es: " + '\n' + "direccion: " + direccion + '\n' + "valor: " + valor);
    }
    public String obtenerDireccion() {
        return direccion;
    }
    public String obtenerValor() {
        return valor;
    }
}
