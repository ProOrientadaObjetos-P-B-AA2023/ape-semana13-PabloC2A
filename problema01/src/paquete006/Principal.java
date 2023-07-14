package paquete006;

import paquete001.Persona;
import paquete002.Ciudad;
import paquete002.Propiedad;
import paquete003.BilleteraPagos;
import paquete004.*;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        //Creacion de Objetos
        Ciudad ciudadCliente = new Ciudad("Loja");
        Persona personaCLiente = new Persona("Pablo","Criollo",18,"1150262101",ciudadCliente);
        BilleteraPagos billeteraCLiente = new BilleteraPagos();
        billeteraCLiente.setPersona(personaCLiente);
        ArrayList<Pago> listaPagos = new ArrayList<>();


        //Ingreso de Datos Agua
        double[][] info1 = DatosAgua.datosComerciales();
        double[][] info2 = DatosAgua.datosCasas();
        for (int i = 0; i < 2 ; i++) {
            listaPagos.add(new PagoAguaPotable(info1[0][i],info1[1][i],info1[2][i],"comercial"));
            listaPagos.add(new PagoAguaPotable(info2[0][i],info2[1][i],info2[2][i],"casa"));
        }

        //Ingreso Datos Luz
        Ciudad ciudadGeneral = new Ciudad("Quito");
        info1 = DatosLuz.datosLoja();
        info2 = DatosLuz.datosGeneral();
        for (int i = 0; i < 2 ; i++) {
            listaPagos.add(new PagoLuzElectrica(info1[0][i],info1[1][i],info1[2][i],ciudadCliente));
            listaPagos.add(new PagoLuzElectrica(info2[0][i],info2[1][i],info2[2][i],ciudadGeneral));
        }

        //Ingreso Datos Predial
        info1 = DatosPropiedades.datos();
        for (int i = 0; i < 2 ; i++) {
            Propiedad propiedad = new Propiedad(info1[i][0]);
            listaPagos.add(new PagoPredial(propiedad,info1[i][1]));
        }


        //Ingreso Datos Telefono
        info2 = DatosTelefono.datos();
        for (int i = 0; i < 2 ; i++) {
            listaPagos.add(new PagoTelefonoConvencional(info2[i][0],(info2[i][1]),(info2[i][2])));
        }


        //Proceso de Calculu de Pagos
        for (Pago aux: listaPagos) {
            aux.calcularPago();
        }

        billeteraCLiente.setListaPagos(listaPagos);
        //Presentar resumen billetera
        System.out.println(billeteraCLiente);
    }
}
