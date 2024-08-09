/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author hisco
 */
public class MAIN{
    public static void main(String[] args) {
 
        CATEDRATICO cat1 = new CATEDRATICO("Luis Diaz", "Av. Santa Elena", "24256359", "Ingeniería");
        CATEDRATICO cat2 = new CATEDRATICO("Sandy Ruiz", "Calle Real Tapias", "54455185", "Matemáticas");

     
        CURSO curso1 = new CURSO("Programación 1", 2, 4, cat1);
        CURSO curso2 = new CURSO("Calculo", 5, 3, cat2);

 
        ALUMNO alumno1 = new ALUMNO("Hugo Sandoval", "Col. Ilusiones", "78496523", 20);
        ALUMNO alumno2 = new ALUMNO("Kevin Lopez", "Col Kennedy", "84895635", 22);

     
        curso1.agregarAlumno(alumno1);
        curso2.agregarAlumno(alumno2);

 
        cat1.imprimirDatos();
        curso1.imprimirDatos();
        alumno1.imprimirDatos();
    }
}


