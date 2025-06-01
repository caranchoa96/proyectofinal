/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoFinal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class GestorArchivos {
    private static final String ARCHIVO = "cursos.txt";
    private static final String ARCHIVO2 = "estudiantes.txt";
    private static final String ARCHIVO3 = "profesores.txt";

    
    public static ArrayList<Curso> cargarCursos() {
        int r = 0;
        ArrayList<Curso> cursos = new ArrayList<>();
        ArrayList<String> estudiantesCursos = new ArrayList<>();
        File archivo = new File(ARCHIVO);
        if (!archivo.exists()) return cursos;
            try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO)))
        {
        String linea;
        while ((linea = reader.readLine()) != null) {
            String[] partes = linea.split(";", 5);
            if (partes.length == 5) {
                String[] maspartes = partes[4].split(",");
                for(int e = 0; e<maspartes.length; e++){
                    estudiantesCursos.add(maspartes[e]);
                }
                cursos.add(new Curso(partes[0], partes[1], partes[2], partes[3], estudiantesCursos));
                estudiantesCursos = new ArrayList<>();
            }
            r++;
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return cursos;
    }
    
    public static void guardarCurso() {       
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO))) {
            StringBuilder sba = new StringBuilder();
            for (int r = 0; r<= Curso.listaDeCursos.size()-1;r++) {
                for(int s = 0; s<Curso.listaDeCursos.get(r).estudiantesCurso.size();s++){
                    if(s==0){
                        sba.append(Curso.listaDeCursos.get(r).estudiantesCurso.get(s));
                    }else{
                        sba.append(",");
                        sba.append(Curso.listaDeCursos.get(r).estudiantesCurso.get(s));
                    }
                }
                writer.write(Curso.listaDeCursos.get(r).nombreCurso + ";" +  Curso.listaDeCursos.get(r).codigoCurso + ";" + Curso.listaDeCursos.get(r).descripcionCurso + ";" + Curso.listaDeCursos.get(r).profesorAsignado + ";" + sba);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
   public static List<Estudiante> cargarEstudiantes(){
       List<Estudiante> estudiantes = new ArrayList<>();
       File archivo = new File(ARCHIVO2);
        if (!archivo.exists()) return estudiantes;
            try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO2)))
        {
        String linea;
        while ((linea = reader.readLine()) != null) {
            String[] partes = linea.split(";", 3);
            if (partes.length == 3) {
                estudiantes.add(new Estudiante(partes[0], partes[1], partes[2]));
            }
        }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return estudiantes;
   }
   
   public static void guardarEstudiantes(){
       try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO2))) {
            for (int r = 0; r<= Estudiante.listaDeEstudiantes.size()-1;r++) {
                writer.write(Estudiante.listaDeEstudiantes.get(r).nombre + ";" +  Estudiante.listaDeEstudiantes.get(r).email + ";" + Estudiante.listaDeEstudiantes.get(r).id);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
   
    public static List<Profesor> cargarProfesor(){
       List<Profesor> profesores = new ArrayList<>();
       File archivo = new File(ARCHIVO3);
        if (!archivo.exists()) return profesores;
            try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO3)))
        {
        String linea;
        while ((linea = reader.readLine()) != null) {
            String[] partes = linea.split(";", 2);
            if (partes.length == 2) {
                profesores.add(new Profesor(partes[0], partes[1]));
            }
        }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return profesores;
    }
    
    public static void guardarProfesor(){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO3))) {
            for (int r = 0; r<= Profesor.listaDeProfesores.size()-1;r++) {
                writer.write(Profesor.listaDeProfesores.get(r).nombre + ";" +  Profesor.listaDeProfesores.get(r).email);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
                