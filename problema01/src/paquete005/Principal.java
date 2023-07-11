package paquete005;

import paquete001.Persona;
import paquete002.Ciudad;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //Variables usadas
        Scanner entrada = new Scanner(System.in);
        Persona cliente = new Persona();
        boolean bandera;
        int opcion_usuario;

        /*Inicio del Programa*/
        bandera = true;
        do {
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


            System.out.println();
            System.out.println("---------- MENU PAGOS ----------");
            System.out.println("1) Agua Potable");
            System.out.println("2) Luz Eléctrica");
            System.out.println("3) Pago Predial");
            System.out.println("4) Teléfono Convencional");
            System.out.println("5) Salir");
            opcion_usuario = entrada.nextInt();
            entrada.nextLine();

            switch (opcion_usuario) {
                case 1 -> {

                }
                case 2 -> {

                }
                case 3 -> {

                }
                case 4 -> {

                }
                case 5 -> {
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
