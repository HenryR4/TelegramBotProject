/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hisco
 */
public class CATEDRATICO {
    private final String nombre;
    private final String direccion;
    private final String telefono;
    private final String profesion;
    private static int contador = 0;
    private final int codigoCatedratico;

    public CATEDRATICO(String nombre, String direccion, String telefono, String profesion) {
        this.codigoCatedratico = ++contador;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.profesion = profesion;
    }

    public void imprimirDatos() {
        System.out.println("Catedratico: " + nombre + ", Código: " + codigoCatedratico);
        System.out.println("Dirección: " + direccion + ", Teléfono: " + telefono + ", Profesión: " + profesion);
    }

    String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
