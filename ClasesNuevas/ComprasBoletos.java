package com.mycompany.menu_cine;

import java.time.LocalDate;
import java.util.ArrayList;
import pelicula.Pelicula;

public class ComprasBoletos {

    String ID;
    LocalDate fechaCompra;
    double precioTotal;
    public ArrayList<Pelicula> boletosComprados = new ArrayList<>();
}
