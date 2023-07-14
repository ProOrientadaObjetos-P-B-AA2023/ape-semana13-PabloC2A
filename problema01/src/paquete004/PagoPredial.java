package paquete004;

import paquete002.Propiedad;

public class PagoPredial extends Pago{
    private Propiedad propiedad;
    private double porcentaje;

    public PagoPredial() {
    }

    public PagoPredial(Propiedad propiedad, double porcentaje) {
        this.propiedad = propiedad;
        this.porcentaje = porcentaje;
    }

    public PagoPredial(double pago, String mes, Propiedad propiedad, double porcentaje) {
        super(pago, mes);
        this.propiedad = propiedad;
        this.porcentaje = porcentaje;
    }

    public void setPropiedad(Propiedad propiedad) {
        this.propiedad = propiedad;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public Propiedad getPropiedad() {
        return propiedad;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    @Override
    public void calcularPago() {
        super.setPago(propiedad.getCostoPropiedad() - ((propiedad.getCostoPropiedad()*porcentaje)/100));
    }

    @Override
    public String toString() {
        return "PagoPredial{" +
                "propiedad=" + propiedad +
                ", porcentaje=" + porcentaje +
                "} " + super.toString();
    }
}
