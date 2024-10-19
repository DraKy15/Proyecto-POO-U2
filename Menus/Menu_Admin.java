/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menus;


import cliente.Cliente;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;
import cine.Cine;
import sala.Sala;
import cliente.Cliente;
import pelicula.Pelicula;
import compraBoletos.ComprasBoletos;

public class Menu_Admin {
    Scanner read = new Scanner(System.in);
    Cine cine = new Cine();

    public int mostrarMenuAdmin() {
        System.out.println("\nSISTEMA CINE");
        System.out.println("1. Registrar cliente");
        System.out.println("2. Seleccionar asientos cine");
        System.out.println("3. Validar compra");
        System.out.println("4. Validar compra adicional");
        System.out.println("5. Seleccionar asientos");
        System.out.println("6. Realizar boleto");
        System.out.println("7. Salir");

        System.out.println("Ingrese una opcion: ");

        int opcion = read.nextInt();

        return opcion;
    }

    public void procesarDatos(int opcion) {
        switch (opcion) {
            case 1:
                System.out.println("Ingresa nombre de cliente: ");
                String nombreCliente = read.nextLine();
                System.out.println("Ingresa apellido del cliente: ");
                String apellidoCliente = read.nextLine();
                System.out.println("Ingresa CURP del cliente: ");
                String curpCliente = read.nextLine();
                System.out.println("Ingresa dirección del cliente: ");
                String direccionCliente = read.nextLine();
                System.out.println("Ingresa año de nacimiento del cliente: ");
                int añoNaciCliente = read.nextInt();
                System.out.println("Ingresa mes de nacimiento del cliente:");
                int mesNaciCliente = read.nextInt();
                System.out.println("Ingresa dia de nacimiento del cliente:");
                int diaNaciCliente = read.nextInt();
                LocalDate fechaNacimiento = LocalDate.of(añoNaciCliente, mesNaciCliente, diaNaciCliente);
                String id = cine.generarid(nombreCliente, apellidoCliente);
                Cliente cliente = new Cliente(id, apellidoCliente, nombreCliente, curpCliente, direccionCliente, fechaNacimiento);
                cine.registrarCliente(cliente);
                break;
            case 6:

        }
    }
}
