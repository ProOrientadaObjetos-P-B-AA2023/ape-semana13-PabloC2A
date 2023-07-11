package paquete004;

public class PagoPredial extends Pago{
    double valorPropiedad;
    double porcentaje;

    public PagoPredial() {
    }

    public PagoPredial(double pago, String mes, double valorPropiedad, double porcentaje) {
        super(pago, mes);
        this.valorPropiedad = valorPropiedad;
        this.porcentaje = porcentaje;
    }

    public void setValorPropiedad(double valorPropiedad) {
        this.valorPropiedad = valorPropiedad;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double getValorPropiedad() {
        return valorPropiedad;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    @Override
    public void calcularPago() {
        super.setPago(valorPropiedad - ((valorPropiedad*porcentaje)/100));
    }

    @Override
    public String toString() {
        return "PagoPredial{" +
                "valorPropiedad=" + valorPropiedad +
                ", porcentaje=" + porcentaje +
                "} " + super.toString();
    }
}
