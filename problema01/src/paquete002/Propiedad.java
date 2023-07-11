package paquete002;

public class Propiedad {
    private double costoPropiedad;

    public Propiedad() {
    }

    public Propiedad(double costoPropiedad) {
        this.costoPropiedad = costoPropiedad;
    }

    public void setCostoPropiedad(double costoPropiedad) {
        this.costoPropiedad = costoPropiedad;
    }

    public double getCostoPropiedad() {
        return costoPropiedad;
    }

    @Override
    public String toString() {
        return "Propiedad{" +
                "costoPropiedad=" + costoPropiedad +
                '}';
    }
}
