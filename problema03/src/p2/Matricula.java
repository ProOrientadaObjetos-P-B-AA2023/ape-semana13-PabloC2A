package p2;


public abstract class Matricula {
    //Atributos
    private double tarifa;
    //Constructor
    public Matricula() {
    }
    
    public Matricula(double tarifa) {
        this.tarifa = tarifa;
    }
    //Metodos SET y GET

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
    
    public double getTarifa() {
        return tarifa;
    }
    //Meotodos
    public abstract void calcularTarifa();
    
    @Override
    public String toString() {
        return "Matricula{" + "tarifa=" + tarifa + '}';
    }
    
}
