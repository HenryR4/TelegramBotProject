/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hisco
 */
public class ALUMNO {
    private final int carnet;
    private final String nombre;
    private final String direccion;
    private final String telefono;
    private final int edad;
    private static int contadorCarnet = 0;

    public ALUMNO(String nombre, String direccion, String telefono, int edad) {
        this.carnet = ++contadorCarnet;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.edad = edad;
    }

    public void imprimirDatos() {
        System.out.println("Alumno: " + nombre + ", Carnet: " + carnet);
        System.out.println("Dirección: " + direccion + ", Teléfono: " + telefono + ", Edad: " + edad);
    }

    String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

