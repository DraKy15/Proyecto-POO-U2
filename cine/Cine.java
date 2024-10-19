package cine;
import pelicula.Pelicula;
import java.util.Random;
import java.time.LocalDate;
import java.util.ArrayList;

public class Cine {

    public ArrayList<Pelicula> listaPeliculas = new ArrayList<>();
    Random rand = new Random();

    public void agregarPelicula(Pelicula pelicula){
        listaPeliculas.add(pelicula);
        System.out.println("Se registró una nueva pelíula.");
    }

    public void eliminarPelicula(Pelicula pelicula){
        this.listaPeliculas.remove(pelicula);
    }

    public String generarIDpelicula(String nombre){

        char letra1 = nombre.charAt(0);
        char letra2 = nombre.charAt(1);
        int aleatorio = rand.nextInt(0,70000);
        int dia = LocalDate.now().getDayOfMonth();
        String ID=String.format("%c%c%d%d" , letra1, letra2, aleatorio, dia);
        return ID.toUpperCase();
    }

    public boolean validadFechaFuncion(LocalDate fechaDeseada) {

        if (fechaDeseada.isBefore(LocalDate.now())) return false;
        return true;
    }

    public void mostrarPeliculas(){

        System.out.println("Ya entró");
        if (this.listaPeliculas.isEmpty()){
            System.out.println("Aún no hay películas registradas :(");
            return;
        }
        for (Pelicula pelicula : this.listaPeliculas) {
            System.out.println(pelicula.mostrarPelicula());
        }
    }
}
