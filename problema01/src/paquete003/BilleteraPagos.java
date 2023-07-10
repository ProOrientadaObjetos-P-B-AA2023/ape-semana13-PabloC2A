/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete003;

import paquete001.Persona;
import paquete004.PagoAguaPotable;
import paquete004.PagoLuzElectrica;
import paquete004.PagoPredial;
import paquete004.PagoTelefonoConvencional;


public class BilleteraPagos {
    public Persona persona;
    public double gastoPagos;
    public String mes; 
    public PagoAguaPotable aguaCasa;
    public PagoAguaPotable aguaComercio;
    public PagoLuzElectrica luzCasa;
    public PagoLuzElectrica luzComercio;
    public PagoPredial casa1;
    public PagoPredial casa2;
    public PagoTelefonoConvencional telefonoCasa;
    public PagoTelefonoConvencional telefonoFinca;

    public BilleteraPagos() {
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Persona getPersona() {
        return persona;
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
