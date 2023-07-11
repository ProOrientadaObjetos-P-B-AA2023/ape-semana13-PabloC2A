package paquete004;

public abstract class Pago {
    private double pago;
    private String mes;

    public Pago() {
    }

    public Pago(double pago, String mes) {
        this.pago = pago;
        this.mes = mes;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public double getPago() {
        return pago;
    }

    public String getMes() {
        return mes;
    }

    public abstract void calcularPago();

    @Override
    public String toString() {
        return "Pago{" +
                "pago=" + pago +
                ", mes='" + mes + '\'' +
                '}';
    }
}
