package paquete004;


public class PagoLuzElectrica {

    public double calcularPago(double tarifaBase, double kilovatiosConsumidos, double costoKilovatio, String ciudad) {
        if (ciudad.equals("Loja")) {
            return tarifaBase + (kilovatiosConsumidos * costoKilovatio / (double) 2);
        } else {
            return tarifaBase + (kilovatiosConsumidos * costoKilovatio);
        }
    }
}
