/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoFinal;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Estudiante extends Persona implements Persona.registroEstudiante{
    static ArrayList<Estudiante> listaDeEstudiantes = new ArrayList<>();
    
    public Estudiante(String nombre, String email, String id) {
        super(nombre, email, id);
    }
    Estudiante(){}
    @Override
    public int registrar(String nombreEstudiante, String emailEstudiante, String idEstudiante) {
        if(!BaseDatosSimulada.estudiantes.contains(nombreEstudiante)){
            BaseDatosSimulada.estudiantes.add(nombreEstudiante);
            Estudiante nuevoEstudiante = new Estudiante(nombreEstudiante,emailEstudiante,idEstudiante);
            listaDeEstudiantes.add(nuevoEstudiante);
            return 0;
        }else{
            return 1;
        }
    }

    public String getEmail() {
        return email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }


}
