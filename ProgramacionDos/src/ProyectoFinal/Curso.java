/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoFinal;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author Usuario
 */
public class Curso {
    public static ArrayList<Curso> listaDeCursos = new ArrayList<>();
    public String descripcionCurso,codigoCurso,nombreCurso,profesorAsignado;
    ArrayList<String> estudiantesCurso = new ArrayList<>();
    
    public String getDescripcionCurso() {
        return descripcionCurso;
    }

    public String getCodigoCurso() {
        return codigoCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public String getProfesorAsignado() {
        return profesorAsignado;
    }



    Curso(String nombreCurso, String codigoCurso, String descripcionCurso, String profesorAsignado){
        this.nombreCurso = nombreCurso;
        this.codigoCurso = codigoCurso;
        this.descripcionCurso = descripcionCurso;
        this.profesorAsignado = profesorAsignado;
    }
    Curso(String nombreCurso, String codigoCurso, String descripcionCurso, String profesorAsignado, ArrayList<String> listaDeEstudiante){
        this.nombreCurso = nombreCurso;
        this.codigoCurso = codigoCurso;
        this.descripcionCurso = descripcionCurso;
        this.profesorAsignado = profesorAsignado;
        this.estudiantesCurso = listaDeEstudiante;
    }
}
