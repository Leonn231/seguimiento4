package Ejercicio1;

import java.util.List;

public class CreditoHipotecario  extends Ejercicio1.Credito {
    private Ejercicio1.Inmueble inmuebles;


    public CreditoHipotecario(List<Ejercicio1.SolicitudCredito> creditos, String estado, Ejercicio1.Inmueble inmuebles) {
        super(creditos, estado);
        this.inmuebles = inmuebles;
    }

    public Ejercicio1.Inmueble getInmuebles() {
        return inmuebles;
    }

    public void setInmuebles(Ejercicio1.Inmueble inmuebles) {
        this.inmuebles = inmuebles;
    }

}
