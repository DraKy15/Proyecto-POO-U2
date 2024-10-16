package menu;

import cine.Cine;
import pelicula.Pelicula;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Menu {

    Scanner read = new Scanner(System.in);
    Cine cine = new Cine();

public void mostrarMenu() {
    boolean salir = false;

    while (!salir) {
        System.out.println("\n Sistema Integral de Gestión para Cinépolis.");
        System.out.println("Elige una de las siguientes opciones: ");
        System.out.println("1. Agregar película.");
        System.out.println("2. Modificar detalles de la película.");
        System.out.println("3. Asignar película a sala.");
        System.out.println("4. Asignar horarios disponibles.");
        System.out.println("5. Administrar películas en cartelera.");
        System.out.println("6. Administrar sala.");
        System.out.println("7. Venta de boletos.");
        System.out.println("8. Salir");
        int opcion = read.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("\n----- AGREGAR PELÍCULA -----\n");
                System.out.print("Ingresa el nombre de la película: ");
                String nombre = read.nextLine();
                System.out.print("Ingresa la categoría de la película: ");
                String categoria = read.nextLine();
                System.out.print("Agregar sinópsis: ");
                String Sinopsis = read.nextLine();

                LocalDateTime Duracion= LocalDateTime.of(2005,06, 01, 10,30);
                while(!cine.validadFechaFuncion(Duracion))
                System.out.println("Ingresar el día de la función: ");
                int dia = read.nextInt();
                System.out.println("Ingresar mes de la función: ");
                int mes = read.nextInt();
                System.out.println("Ingresar año de la función: ");
                int año = read.nextInt();
                System.out.print("Ingresa la duración de horas de la película: ");
                int horas = read.nextInt();
                System.out.println("Ingresa la duración de minutos de la película: ");
                int minutos = read.nextInt();
                LocalDateTime DuracionPelicula = LocalDateTime.of(año, mes, dia, horas, minutos);
                Pelicula pelicula= new Pelicula(nombre, categoria, DuracionPelicula, Sinopsis);
                cine.agregarPeliculas(pelicula);
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
                salir = true;
                System.out.println("Gracias por usar el Sistema Integral de Gestión para Cinépolis");
                break;
            default:
                System.out.println("Opción no válida. Por favor, intentelo de nuevo.");
            }
        }
    }
}
