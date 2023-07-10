package p1;

import p2.Matricula;


public class MatriculaColegio extends Matricula{
    
        public MatriculaColegio() {
        
    }
        
    public MatriculaColegio(double tarifa) {
        super(tarifa);
    }

    @Override
    public void calcularTarifa() {
        // tarifa = costo deportes + costo folletos + costo uniformes + costo laboratorios
        double tarifa = 150.2 + 140.2 + 240.2 + 300.4;
        super.setTarifa(tarifa);
    }
}
