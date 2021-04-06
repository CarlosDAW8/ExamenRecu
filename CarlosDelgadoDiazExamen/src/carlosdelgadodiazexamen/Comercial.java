/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosdelgadodiazexamen;

/**
 *
 * @author cardd
 */
public class Comercial {
    private String nombre;
    private double sueldo;
    private String fecha_nacimiento;

    public Comercial(String nombre, double sueldo, String fecha_nacimiento) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    @Override
    public String toString() {
        return "Comercial{" + "nombre=" + nombre + ", sueldo=" + sueldo + ", fecha_nacimiento=" + fecha_nacimiento + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }




    
}
