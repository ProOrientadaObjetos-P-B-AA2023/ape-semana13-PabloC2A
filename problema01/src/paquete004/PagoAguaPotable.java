package paquete004;

public class PagoAguaPotable extends Pago{
    private double tarifaFija;
    private double metrosCubicosConsumo;
    private double costoConsumoCubicos;
    private String tipo;

    public PagoAguaPotable() {
    }

    public PagoAguaPotable(double tarifaFija, double metrosCubicosConsumo, double costoConsumoCubicos, String tipo) {
        this.tarifaFija = tarifaFija;
        this.metrosCubicosConsumo = metrosCubicosConsumo;
        this.costoConsumoCubicos = costoConsumoCubicos;
        this.tipo = tipo;
    }

    public PagoAguaPotable(double pago, String mes, double tarifaFija, double metrosCubicosConsumo, double costoConsumoCubicos, String tipo) {
        super(pago, mes);
        this.tarifaFija = tarifaFija;
        this.metrosCubicosConsumo = metrosCubicosConsumo;
        this.costoConsumoCubicos = costoConsumoCubicos;
        this.tipo = tipo;
    }

    public void setTarifaFija(double tarifaFija) {
        this.tarifaFija = tarifaFija;
    }

    public void setMetrosCubicosConsumo(double metrosCubicosConsumo) {
        this.metrosCubicosConsumo = metrosCubicosConsumo;
    }

    public void setCostoConsumoCubicos(double costoConsumoCubicos) {
        this.costoConsumoCubicos = costoConsumoCubicos;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getTarifaFija() {
        return tarifaFija;
    }

    public double getMetrosCubicosConsumo() {
        return metrosCubicosConsumo;
    }

    public double getCostoConsumoCubicos() {
        return costoConsumoCubicos;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public void calcularPago() {
        if(tipo.equals("comercial")){
            super.setPago(tarifaFija + (metrosCubicosConsumo * costoConsumoCubicos) + 15);
        }else{
            super.setPago(tarifaFija + (metrosCubicosConsumo * costoConsumoCubicos));
        }
    }

    @Override
    public String toString() {
        return "PagoAguaPotable{" +
                "tarifaFija=" + tarifaFija +
                ", metrosCubicosConsumo=" + metrosCubicosConsumo +
                ", costoConsumoCubicos=" + costoConsumoCubicos +
                ", tipo='" + tipo + '\'' +
                "} " + super.toString();
    }
}
