/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1;

import p2.Matricula;

/**
 *
 * @author Pablo
 */
public class MatriculaEscuela extends Matricula{

    public MatriculaEscuela() {
    }
    

    public MatriculaEscuela(double tarifa) {
        super(tarifa);
    }

    @Override
    public void calcularTarifa() {
        // tarifa = costo libros + costo deportes + costo folletos + costo uniformes
        double tarifa = 50.2 + 40.2 + 140.2 + 200.4;
        super.setTarifa(tarifa);
    }
    
}
