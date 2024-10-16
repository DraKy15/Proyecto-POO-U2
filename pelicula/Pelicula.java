package pelicula;

import java.time.LocalTime;
import java.util.ArrayList;

public class Pelicula {

    public String nombre, categoria, Sinopsis;
    public LocalDateTime duracion;

    public Pelicula(String nombre, String categoria, LocalDateTime duracion, String Sinopsis) {

        this.nombre = nombre;
        this.categoria = categoria;
        this.duracion = duracion;
        this.Sinopsis = Sinopsis;

    }
    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getSinopsis() {
        return Sinopsis;
    }

    public LocalTime getDuracion() {
        return duracion;
    }

    public void agregarPelicula(){

    }

}
