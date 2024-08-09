/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hisco
 */
public class ASIGNACION {
    private final ALUMNO alumno;
    private final CURSO curso;

    public ASIGNACION(ALUMNO alumno, CURSO curso) {
        this.alumno = alumno;
        this.curso = curso;
        curso.agregarAlumno(alumno);
    }

    public void imprimirAsignacion() {
        System.out.println("Asignación: ");
        System.out.println("Alumno: " + alumno.getNombre());
        System.out.println("Curso: " + curso.getTitulo());
    }
}

