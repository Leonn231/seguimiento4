package Ejercicio1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class SolicitudCredito {
    private List<Cliente> clientes;
    private String tipoDeCredito;
    private int monto;
    private String plazo;
    private Double tasaInteres;

    public SolicitudCredito(List<Cliente> cliente, String tipoDeCredito, int monto, String plazo, Double tasaInteres) {
        this.clientes = new ArrayList<>();
        this.tipoDeCredito = tipoDeCredito;
        this.monto = monto;
        this.plazo = plazo;
        this.tasaInteres = tasaInteres;
    }

    public String getTipoDeCredito() {
        return tipoDeCredito;
    }

    public void setTipoDeCredito(String tipoDeCredito) {
        this.tipoDeCredito = tipoDeCredito;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getPlazo() {
        return plazo;
    }

    public void setPlazo(String plazo) {
        this.plazo = plazo;
    }

    public Double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(Double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }
    public void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void mostrarMiSolicitudCredito() {
        JOptionPane.showMessageDialog(null,"Su solicitud de credito tiene los siguientes datos: " + '\n' + "su ingreso y su usuario: "  + getClientes() +  '\n' + "su tipo de credito: " + tipoDeCredito +'\n' + "su monto es de: " + monto +'\n' +"su plazo es de: " +plazo +'\n' + "Taza de interes:" +tasaInteres );
    }


    public void obtenerTipoCredito() {
        int tp = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el tipo de credito: 1 = personal 2 = hipotecario"));
        if(tp == 1){
            String tipoSelecionado = "personal";
            tipoDeCredito = tipoSelecionado;
            obtenerMonto();
        }else if(tp == 2){
            String tipoSelecionado = "hipotecario";
            tipoDeCredito = tipoSelecionado;
            obtenerMonto();
        }
    }

    public void obtenerMonto() {
        if(tipoDeCredito == "personal"){
            JOptionPane.showMessageDialog(null,"El tipo de credito es personal por lo que su monto es fijo y es: " + monto);
            obtenerTasaInteres();
        }else if(tipoDeCredito == "hipotecario"){
           int montoNuevo = Integer.parseInt(JOptionPane.showInputDialog(null,"el tipo de credito es hipotecario por lo que su monto es variable, escoja la cantidad de su monto: " ));
            monto = montoNuevo;
            JOptionPane.showMessageDialog(null,"su monto es de: " + monto);
            obtenerTasaInteres();
        }
    }
    public void obtenerTasaInteres() {
        if (tipoDeCredito == "personal"){
            JOptionPane.showMessageDialog(null,"su taza de interes es de: " + tasaInteres + " ya que es credito personal");
            obtenerPlazo();
        }else if(tipoDeCredito == "hipotecario"){
            double interes = Double.parseDouble(JOptionPane.showInputDialog(null,"ingrese el interes que desea: "));
            tasaInteres = interes;
            obtenerPlazo();
        }
    }
    public void obtenerPlazo() {
        if(tipoDeCredito == "personal"){
            JOptionPane.showMessageDialog(null,"al ser tipo de credito personar su plazo es fijo y es: " + plazo);

        }else if(tipoDeCredito == "hipotecario"){
            String plazo1 = JOptionPane.showInputDialog(null,"al ser credito hipotecario es plazo variable entonces escoja el plazo que desea: ");
            plazo = plazo1;
            JOptionPane.showMessageDialog(null,"su plazo es de: " + plazo);

        }
    }

}
