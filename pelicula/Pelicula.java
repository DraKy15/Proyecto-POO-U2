package pelicula;

import pelicula.utils.Categoria;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Pelicula {

    public String nombre, Sinopsis, ID;
    public LocalTime duracion;
    public LocalDate FechaFuncion;
    public Categoria categoria;

    public Pelicula(String ID, String nombre, LocalTime duracion, LocalDate FechaFuncion, String Sinopsis) {

        this.ID = ID;
        this.nombre = nombre;
        this.duracion = duracion;
        this.Sinopsis = Sinopsis;
        this.FechaFuncion = FechaFuncion;
    }
    public String getNombre() {
        return nombre;
    }

    public Categoria getcategoria() {
        return categoria;
    }

    public String getSinopsis() {
        return Sinopsis;
    }

    public LocalTime getDuracion() {
        return duracion;
    }

    public String getID() {
        return ID;
    }

    public LocalDate getFechaFuncion() {
        return FechaFuncion;
    }

    public String mostrarPelicula(){

        String info=String.format("%s, %s, %s, %s, %s, %s", ID, nombre, categoria, duracion, Sinopsis, FechaFuncion);
        return info;
    }
}
