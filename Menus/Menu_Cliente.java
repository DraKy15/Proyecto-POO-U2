/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menu_cine.Menus;

import com.mycompany.menu_cine.Cine;
import com.mycompany.menu_cine.ComprasBoletos;
import com.mycompany.menu_cine.Reservacion;
import java.util.Scanner;

/**
 *
 * @author ameti
 */
public class Menu_Cliente {

    Scanner read = new Scanner(System.in);
    Cine cine = new Cine();
    Reservacion reservacion = new Reservacion();
    ComprasBoletos comprarBoletos = new ComprasBoletos();

    public int mostrarMenuCliente() {
        System.out.println("\nSISTEMA HOSPITAL");
        System.out.println("1. Ver mis reservaciones");
        System.out.println("2. Comprar boletos");
        System.out.println("3. Ver Cartelera");
        System.out.println("4. Reservar asientos");
        System.out.println("5. Salir");

        System.out.println("Ingrese una opcion: ");
        int opcion = read.nextInt();

        return opcion;
    }

    public void procesarDatosMenu(int opcion, Cliente cliente, Cine cine) {
        switch (opcion) {
            case 1:
                System.out.println("\n Tus Reservacione: ");
                reservacion.mostrarReservaciones(cliente.getId());
                break;
            case 2:
                comprarBoletos.

                break;

            case 3:
                System.out.println("\n Cartelera");
                cine.mostrarPeliculas();
                break;
            case 4:
                
                break;
        }
    }
}
