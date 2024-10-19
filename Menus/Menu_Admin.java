/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menus;


import java.util.Random;
import java.util.Scanner;

public class Menu_Admin {
    Scanner read=new Scanner(System.in);

    public int mostrarMenuAdmin(){
        System.out.println("\nSISTEMA CINE");
        System.out.println("1. Seleccionar asientos cine");
        System.out.println("2. Validar compra");
        System.out.println("3. Validar compra adicional");
        System.out.println("4. ");
        System.out.println("5. Salir");

        System.out.println("Ingrese una opcion: ");

        int opcion = read.nextInt();

        return opcion;
    }
}
