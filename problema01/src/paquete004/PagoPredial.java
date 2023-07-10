package paquete004;


public class PagoPredial {
    public double calcularPago(double valorPropiedad, double porcentaje){
        return valorPropiedad - ((valorPropiedad*porcentaje) / (double) 100);
    }
}
