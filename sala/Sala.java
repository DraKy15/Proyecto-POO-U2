package sala;

import java.time.LocalDate;

public class Sala {

    public int  ID, CapacidadDeAsientos;
    public int CantidadDeAsientosPremium;
    public int CantidadDeAsientosVIP;
    public String PeliculasProyecta;
    public LocalDate HorariosSala;
    public String distribucion;

    public Sala(int ID, int capacidadDeAsientos, int cantidadDeAsientosPremium, int cantidadDeAsientosVIP,
                String peliculasProyecta, LocalDate horariosSala, String Distribucion) {
        this.ID = ID;
        this.CapacidadDeAsientos = capacidadDeAsientos;
        this.CantidadDeAsientosPremium = cantidadDeAsientosPremium;
        this.CantidadDeAsientosVIP = cantidadDeAsientosVIP;
        this.PeliculasProyecta = peliculasProyecta;
        this.HorariosSala = horariosSala;
        this.distribucion = Distribucion;
    }
}
