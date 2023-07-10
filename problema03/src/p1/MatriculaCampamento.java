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
public class MatriculaCampamento extends Matricula{
    //Constructor
    public MatriculaCampamento() {
    }

    public MatriculaCampamento(double tarifa) {
        super(tarifa);
    }
    //Metodos
    @Override
    public void calcularTarifa() {
        // tarifa = costo transporte + costo comida + costo instructores
        double tarifa = 100.2 + 30.2 + 90.2;
        super.setTarifa(tarifa);
    }
}
