package paquete003;

import paquete001.Persona;
import paquete004.Pago;

import java.util.ArrayList;

public class BilleteraPagos {
    private Persona persona;
    private double gastoPagos;
    ArrayList<Pago> listaPagos;

    public BilleteraPagos() {
    }

    public BilleteraPagos(Persona persona, double gastoPagos, ArrayList<Pago> listaPagos) {
        this.persona = persona;
        this.gastoPagos = gastoPagos;
        this.listaPagos = listaPagos;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public void setGastoPagos(double gastoPagos) {
        this.gastoPagos = gastoPagos;
    }

    public void setListaPagos(ArrayList<Pago> listaPagos) {
        this.listaPagos = listaPagos;
    }

    public Persona getPersona() {
        return persona;
    }

    public double getGastoPagos() {
        return gastoPagos;
    }

    public ArrayList<Pago> getListaPagos() {
        return listaPagos;
    }

    @Override
    public String toString() {
        return String.format("""
            *---------- REPORTE ----------*
            -Cliente: %s %s
            -Cédula: %s
            """,
                      this.persona.getNombre(),this.persona.getApellido(),
                      this.persona.getCedula());
    }
}
