package paquete003;

import paquete004.Pago;

import java.util.ArrayList;

public class calcularGastoTotalPagos {
    public static double calcularGastoTotalPagosCliente(ArrayList<Pago> historialPago) {
        double totalPagos = 0;
        for (Pago aux:historialPago) {
            totalPagos += aux.getPago();
        }
        return totalPagos;
    }
}
