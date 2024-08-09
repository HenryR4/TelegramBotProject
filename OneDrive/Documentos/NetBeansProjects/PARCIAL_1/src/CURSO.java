
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hisco
 */
public class CURSO {
    private final int id;
    private final String titulo;
    private final int numMaxAlumnos = 0;
    private final int creditos;
    private final CATEDRATICO catedratico;
    private final List<ALUMNO> alumnosAsignados;
    private static int contadorID = 0;

    public CURSO(String titulo, int numMaxALUMNOS, int creditos, CATEDRATICO catedratico) {
        this.id = ++contadorID;
        this.titulo = titulo;
        this.creditos = creditos;
        this.catedratico = catedratico;
        this.alumnosAsignados = new ArrayList<>();
    }

    public boolean verificaEspacio() {
        return alumnosAsignados.size() < numMaxAlumnos;
    }

    public void agregarAlumno(ALUMNO alumno) {
        if (verificaEspacio()) {
            alumnosAsignados.add(alumno);
            System.out.println("Alumno " + alumno.getNombre() + " agregado al curso " + titulo);
        } else {
            System.out.println("No hay espacio disponible en el curso " + titulo);
        }
    }

    public void imprimirDatos() {
        System.out.println("Curso: " + titulo + ", ID: " + id + ", Créditos: " + creditos);
        System.out.println("Catedrático: " + catedratico.getNombre());
        System.out.println("Alumnos inscritos:");
        for (ALUMNO alumno : alumnosAsignados) {
            System.out.println("- " + alumno.getNombre());
        }
    }

    public String getTitulo() {
        return titulo;
    }
}


