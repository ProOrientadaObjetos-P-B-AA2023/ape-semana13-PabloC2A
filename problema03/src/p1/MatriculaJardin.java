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
public class MatriculaJardin extends Matricula{

    public MatriculaJardin() {
    }
    

    public MatriculaJardin(double tarifa) {
        super(tarifa);
    }

    @Override
    public void calcularTarifa() {
        // tarifa = costo desayunos + costo libros + costo paseos
        double tarifa = 50.2 + 140.2 + 40;
        super.setTarifa(tarifa);
    }
    
}
