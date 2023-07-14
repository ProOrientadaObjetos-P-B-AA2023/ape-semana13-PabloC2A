package paquete004;

import paquete002.Ciudad;

public class PagoLuzElectrica extends Pago{
    private double tarifaBase;
    private double kilovatiosConsumidos;
    private double costoKilovatio;
    private Ciudad ciudad;

    public PagoLuzElectrica() {
    }

    public PagoLuzElectrica(double tarifaBase, double kilovatiosConsumidos, double costoKilovatio, Ciudad ciudad) {
        this.tarifaBase = tarifaBase;
        this.kilovatiosConsumidos = kilovatiosConsumidos;
        this.costoKilovatio = costoKilovatio;
        this.ciudad = ciudad;
    }

    public PagoLuzElectrica(double pago, String mes, double tarifaBase, double kilovatiosConsumidos, double costoKilovatio, Ciudad ciudad) {
        super(pago, mes);
        this.tarifaBase = tarifaBase;
        this.kilovatiosConsumidos = kilovatiosConsumidos;
        this.costoKilovatio = costoKilovatio;
        this.ciudad = ciudad;
    }

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public void setKilovatiosConsumidos(double kilovatiosConsumidos) {
        this.kilovatiosConsumidos = kilovatiosConsumidos;
    }

    public void setCostoKilovatio(double costoKilovatio) {
        this.costoKilovatio = costoKilovatio;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public double getKilovatiosConsumidos() {
        return kilovatiosConsumidos;
    }

    public double getCostoKilovatio() {
        return costoKilovatio;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    @Override
    public void calcularPago() {
        if (ciudad.getNombreCiudad().equals("Loja")) {
            super.setPago(tarifaBase + (kilovatiosConsumidos * costoKilovatio / 2));
        } else {
            super.setPago(tarifaBase + (kilovatiosConsumidos * costoKilovatio));
        }
    }

    @Override
    public String toString() {
        return "PagoLuzElectrica{" +
                "tarifaBase=" + tarifaBase +
                ", kilovatiosConsumidos=" + kilovatiosConsumidos +
                ", costoKilovatio=" + costoKilovatio +
                ", ciudad=" + ciudad +
                "} " + super.toString();
    }
}
