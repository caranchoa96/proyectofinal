/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoFinal;

import java.util.ArrayList;

import java.util.List;

/**
 *
 * @author Usuario
 */
public class MainApp{
    static int registro;
    public static void main(String[] args) {
        List<Curso> cursosCargados = new ArrayList(GestorArchivos.cargarCursos());
        
        for(int r = 0; r < cursosCargados.size(); r++){
            BaseDatosSimulada.cursos.add(cursosCargados.get(r).nombreCurso);
            Curso.listaDeCursos.add(cursosCargados.get(r));
        }

        List<Estudiante> EstudiantesCargados = new ArrayList(GestorArchivos.cargarEstudiantes());
        for(Estudiante estudiantes : EstudiantesCargados){
            BaseDatosSimulada.estudiantes.add(estudiantes.nombre);
            Estudiante.listaDeEstudiantes.add(estudiantes);
        }
        List<Profesor> profesoresCargados = new ArrayList(GestorArchivos.cargarProfesor());
        for(Profesor profesores : profesoresCargados){
            BaseDatosSimulada.estudiantes.add(profesores.nombre);
            Profesor.listaDeProfesores.add(profesores);
        }
        VistaPrincipal a = new VistaPrincipal();
        a.setVisible(true);       
    }   
}
