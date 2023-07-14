package paquete004;

public class PagoTelefonoConvencional extends Pago {
    double tarifa;
    double minutosConsumidos;
    double costoMinuto;

    public PagoTelefonoConvencional() {
    }

    public PagoTelefonoConvencional(double tarifa, double minutosConsumidos, double costoMinuto) {
        this.tarifa = tarifa;
        this.minutosConsumidos = minutosConsumidos;
        this.costoMinuto = costoMinuto;
    }

    public PagoTelefonoConvencional(double pago, String mes, double tarifa, double minutosConsumidos, double costoMinuto) {
        super(pago, mes);
        this.tarifa = tarifa;
        this.minutosConsumidos = minutosConsumidos;
        this.costoMinuto = costoMinuto;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public void setMinutosConsumidos(double minutosConsumidos) {
        this.minutosConsumidos = minutosConsumidos;
    }

    public void setCostoMinuto(double costoMinuto) {
        this.costoMinuto = costoMinuto;
    }

    public double getTarifa() {
        return tarifa;
    }

    public double getMinutosConsumidos() {
        return minutosConsumidos;
    }

    public double getCostoMinuto() {
        return costoMinuto;
    }

    @Override
    public void calcularPago() {
        super.setPago(tarifa + (minutosConsumidos * costoMinuto));
    }

    @Override
    public String toString() {
        return "PagoTelefonoConvencional{" +
                "tarifa=" + tarifa +
                ", minutosConsumidos=" + minutosConsumidos +
                ", costoMinuto=" + costoMinuto +
                "} " + super.toString();
    }
}
