package cliente;

import java.time.LocalDate;
import java.util.Random;

public class Cliente {
    String id, apellidos, nombre, CURP;
    private String direccion;
    LocalDate fechaNacimiento;

    public Cliente(String id, String apellidos, String nombre, String CURP, String direccion, LocalDate fechaNacimiento) {
        this.id = id;
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.CURP = CURP;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getId() {
        return id;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCURP() {
        return CURP;
    }

    public String getDireccion() {
        return direccion;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String generarid(String nombre, String apellido){
        Random random=new Random();
        int num_al= random.nextInt(0, 100000);
        char primeraLetra=nombre.charAt(0);
        char segundaLetra=nombre.charAt(1);
        char primeraLetraApellido=apellido.charAt(0);
        char segundaLetraApellido=apellido.charAt(1);
        LocalDate fecha=LocalDate.now();
        String idC=String.format("C%c%c%c%c%d", primeraLetra, segundaLetra, primeraLetraApellido, segundaLetraApellido, num_al);
        return idC;
    }
    public void generarVIP(String id){

    }
}
