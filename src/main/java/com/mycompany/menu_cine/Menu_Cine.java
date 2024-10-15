/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.menu_cine;

import java.util.Scanner;

public class Menu_Cine {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        boolean salir = false;
        
        while (!salir) {
            System.out.println("\n Sistema Integral de Gestión para Cinépolis \n");
            System.out.println("Elige una de las siguientes opciones: ");
            System.out.println("1.Agregar Pelicula");
            System.out.println("2.Modificar Pelicula");
            System.out.println("3.Asignar Pelicula a Sala");
            System.out.println("4.Asignar Horarios disponibles");
            System.out.println("5.Administrar Peliculas en Cartelera");
            System.out.println("6.Administrar Sala");
            System.out.println("7. Venta de Boletos");
            System.out.println("8. Reservacion Compleja");
            System.out.println("9. Salir");
            int opcion = read.nextInt();

            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    salir = true;
                    System.out.println("Gracias por usar el Sistema Integral de Gestión para Cinépolis");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intentelo de nuevo.");
            }
        }
    }
}
