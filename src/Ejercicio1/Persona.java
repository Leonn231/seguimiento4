package Ejercicio1;

import javax.swing.*;
import java.util.ArrayList;

public class Persona {
    private String nombre;
    private int identificacion;
    private String direccion;

    public Persona(String nombre, int identificacion, String direccion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void ingresarPersona() {
        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre dela persona: ");
        this.nombre = nombre;
        int identificacion = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la identificacion del persona: "));
        this.identificacion = identificacion;
        String direccion = JOptionPane.showInputDialog(null,"Ingrese la direccion de la persona: ");
        this.direccion = direccion;
    }

}

class Cliente extends Persona{

    ArrayList<String> historialCrediticio = new ArrayList<String>();
    private int ingreso;

    public Cliente(String nombre, int identificacion, String direccion, String historialCrediticio, int ingreso) {
        super(nombre, identificacion, direccion);
        this.historialCrediticio = new ArrayList<>();
        this.ingreso = ingreso;
    }

    public int getIngreso() {
        return ingreso;
    }

    public void setIngreso(int ingreso) {
        this.ingreso = ingreso;
    }
    public void registrarIngreso(){
     int ingreso =   Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el ingreso de la persona: "));
    this.ingreso = ingreso;
    }
    public void obtenerCliente(){
        JOptionPane.showMessageDialog(null, "su usuario es: "+'\n' + "nombre: " + getNombre() +'\n' + "identificacion: " + getIdentificacion() +'\n' + "direccion: " + getDireccion() +'\n' + "ingreso: " + getIngreso());
    }
    public void obtenerHistorialCrediticio(){

    }
}