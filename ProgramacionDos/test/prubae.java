

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class prubae {
    private static final String ARCHIVO5 = "cursos2.txt";
    ArrayList<prubae> listadeCursos = new ArrayList<>();
    ArrayList<String> estudiantes = new ArrayList();
    static Map<String,ArrayList> a = new HashMap<>();
    static int ncurso = -1;
    
    public static void main(String[] args) {
        prubae eo = new prubae();
        eo.estudiantes.add("Pollo");
        eo.estudiantes.add("Berenjena");
        eo.añadirCurso(eo.estudiantes);
        eo = new prubae();
        eo.estudiantes.add("arroz");
        eo.estudiantes.add("lentejas");
        eo.añadirCurso(eo.estudiantes);
        for (Map.Entry<String, ArrayList> entry : a.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
        double re=3.7;
        double e=4.1;
        System.out.println((re*0.30)+(e*0.70));
    }
    void añadirCurso(ArrayList e){
        ncurso++;
        a.put("curso"+ncurso, e);
    }
    public static List cargarCursos() {
        List cursos = new ArrayList<>();
        File archivo = new File(ARCHIVO5);
        if (!archivo.exists()) return cursos;
            try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO5)))
        {
        String linea;
        while ((linea = reader.readLine()) != null) {
                cursos.add(linea);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return cursos;
    }
    
    public static void guardarCurso() {       
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO5))) {
            for (Map.Entry<String, ArrayList> entry : a.entrySet()) {
                System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
            }
            for (int r = 0; r<= Curso.listaDeCursos.size()-1;r++) {
                writer.write(Curso.listaDeCursos.get(r).nombreCurso + ";" +  Curso.listaDeCursos.get(r).codigoCurso + ";" + Curso.listaDeCursos.get(r).descripcionCurso + ";" + Curso.listaDeCursos.get(r).profesorAsignado + ";" + sba);
                writer.newLine();
                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
