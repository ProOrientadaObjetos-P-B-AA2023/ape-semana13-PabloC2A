package paquete005;

import paquete001.Persona;
import paquete002.Ciudad;
import paquete002.Propiedad;
import paquete003.BilleteraPagos;
import paquete004.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //Variables usadas
        Scanner entrada = new Scanner(System.in);
        Persona cliente = new Persona();
        BilleteraPagos billeteraCliente = new BilleteraPagos();
        ArrayList<Pago> listaPagos = new ArrayList<>();

        boolean bandera;
        int opcion_usuario;

        /*Inicio del Programa*/
        bandera = true;

        System.out.println("*-------------- BILLETERA PAGOS --------------*");
        System.out.println("Bienvenido estimad@ cliente.");
        System.out.println();


        System.out.println("*-------------- REGISTRO --------------*");
        System.out.print("-Ingrese su nombre: ");
        cliente.setNombre(entrada.nextLine());
        System.out.print("-Ingrese su apellido: ");
        cliente.setApellido(entrada.nextLine());
        System.out.print("-Ingrese su edad: ");
        cliente.setEdad(entrada.nextInt());
        entrada.nextLine();
        System.out.print("-Ingrese su número de cédula: ");
        cliente.setCedula(entrada.nextLine());
        System.out.print("-Ingrese su ciudad: ");
        Ciudad ciudad = new Ciudad(entrada.nextLine());
        cliente.setCiudad(ciudad);
        billeteraCliente.setPersona(cliente);

        do {
            billeteraCliente.setListaPagos(listaPagos);
            System.out.println();
            System.out.println("*---------- MENU PAGOS ----------*");
            System.out.println("1) Agua Potable");
            System.out.println("2) Luz Eléctrica");
            System.out.println("3) Pago Predial");
            System.out.println("4) Teléfono Convencional");
            System.out.println("5) Reporte");
            System.out.println("6) Salir");
            System.out.print("-Ingrese una opcion: ");
            opcion_usuario = entrada.nextInt();
            entrada.nextLine();

            switch (opcion_usuario) {
                case 1 -> {
                    PagoAguaPotable aguaPotable = new PagoAguaPotable();
                    System.out.println("*------------ PAGO ------------*");
                    System.out.print("Ingrese el mes: ");
                    aguaPotable.setMes(entrada.nextLine());
                    System.out.print("Tarifa: ");
                    aguaPotable.setTarifaFija(entrada.nextDouble());
                    System.out.print("Metros Cubicos Consumo: ");
                    aguaPotable.setMetrosCubicosConsumo(entrada.nextDouble());
                    System.out.print("Costo Consumo Cubicos: ");
                    aguaPotable.setCostoConsumoCubicos(entrada.nextDouble());
                    entrada.nextLine();
                    System.out.print("Tipo (comercial/casa): ");
                    aguaPotable.setTipo(entrada.nextLine());
                    aguaPotable.calcularPago();
                    listaPagos.add(aguaPotable);
                }
                case 2 -> {
                    PagoLuzElectrica luzElectrica = new PagoLuzElectrica();
                    luzElectrica.setCiudad(ciudad);
                    System.out.println("*------------ PAGO ------------*");
                    System.out.print("Ingrese el mes: ");
                    luzElectrica.setMes(entrada.nextLine());
                    System.out.print("Tarifa Base: ");
                    luzElectrica.setTarifaBase(entrada.nextDouble());
                    System.out.print("Kilovatios Consumidos: ");
                    luzElectrica.setKilovatiosConsumidos(entrada.nextDouble());
                    System.out.print("Costo Kilovatio: ");
                    luzElectrica.setCostoKilovatio(entrada.nextDouble());
                    entrada.nextLine();
                    luzElectrica.calcularPago();
                    listaPagos.add(luzElectrica);
                }
                case 3 -> {
                    PagoPredial pagoPredial = new PagoPredial();
                    System.out.println("*------------ PAGO ------------*");
                    System.out.print("Ingrese el mes: ");
                    pagoPredial.setMes(entrada.nextLine());
                    System.out.print("Valor Propiedad: ");
                    pagoPredial.setPropiedad(new Propiedad(entrada.nextDouble()));
                    System.out.print("Porcentaje: ");
                    pagoPredial.setPorcentaje(entrada.nextDouble());
                    entrada.nextLine();
                    pagoPredial.calcularPago();
                    listaPagos.add(pagoPredial);
                }
                case 4 -> {
                    PagoTelefonoConvencional telefonoConvencional = new PagoTelefonoConvencional();
                    System.out.println("*------------ PAGO ------------*");
                    System.out.print("Ingrese el mes: ");
                    telefonoConvencional.setMes(entrada.nextLine());
                    System.out.print("Tarifa: ");
                    telefonoConvencional.setTarifa(entrada.nextDouble());
                    System.out.print("Minutos Consumidos: ");
                    telefonoConvencional.setMinutosConsumidos(entrada.nextDouble());
                    System.out.print("Costo Minuto: ");
                    telefonoConvencional.setCostoMinuto(entrada.nextDouble());
                    telefonoConvencional.calcularPago();
                    listaPagos.add(telefonoConvencional);
                }
                case 5 -> {
                    System.out.println(billeteraCliente);
                }
                case 6 -> {
                    bandera = false;
                    System.out.println("*------- Saliendo de la Billetera -------*");
                    entrada.close();
                }
                default -> {
                    System.out.println();
                    System.out.println("Opcion Incorrecta");
                    System.out.println();
                }
            }

        } while (bandera);
    }
}
