
package com.mycompany.menu_cine.Menus;
import java.time.LocalDate;

public class Cliente {
    String id;
    String nombre;
    String apellidos;
    LocalDate fechaNacimiento;
    private String direccion;
    String CURP;

    public Cliente(String id, String nombre, String apellidos, LocalDate fechaNacimiento, String direccion, String CURP) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.CURP = CURP;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCURP() {
        return CURP;
    }
    
    
    
    
    
}
