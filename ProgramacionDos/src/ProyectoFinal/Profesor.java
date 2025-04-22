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
public class Profesor extends Persona implements Persona.registroProfesor {
    static ArrayList<Profesor> listaDeProfesores = new ArrayList<>();
    public Profesor(String nombre, String email) {
        super(nombre, email);
    }
    Profesor(){}
    @Override
    
    public int registrar(String nombreProfesor, String emailProfesor) {
        if(!BaseDatosSimulada.profesores.contains(nombreProfesor)){
            BaseDatosSimulada.profesores.add(nombreProfesor);
            Profesor nuevoProfesor = new Profesor(nombreProfesor,emailProfesor);
            listaDeProfesores.add(nuevoProfesor);
            return 0;
        }else{
            return 1;
        }
    }
}
