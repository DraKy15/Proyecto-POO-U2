package cine;
import pelicula.Pelicula;
import java.util.ArrayList;

public class Cine {
    
    public ArrayList<Pelicula> listaPeliculas = new ArrayList<>();

    public void agregarPeliculas(Pelicula pelicula){
        this.listaPeliculas.add(pelicula);

    }

    public void eliminarPelicula(Pelicula pelicula){
        this.listaPeliculas.remove(pelicula);
    }

    public void generarIDpelicula(){


    }
}
