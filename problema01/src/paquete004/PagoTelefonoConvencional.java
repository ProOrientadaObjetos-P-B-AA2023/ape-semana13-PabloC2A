package paquete004;


public class PagoTelefonoConvencional {
    public double calcularPago(double tarifa, double minutosConsumidos, double costoMinuto){
        return tarifa + (minutosConsumidos * costoMinuto);
    }
}
