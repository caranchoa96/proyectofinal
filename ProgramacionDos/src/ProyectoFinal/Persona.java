/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoFinal;

/**
 *
 * @author Usuario
 */
public abstract class Persona {
    protected String email;
    protected String nombre;
    protected String id;
    public Persona(String nombre, String email, String id){
        this.nombre = nombre;
        this.email = email;
        this.id = id;
    }
    public Persona(String nombre, String email){
        this.nombre = nombre;
        this.email = email;
        
    }   
    public Persona(){}
    interface registroEstudiante{
        int registrar(String nombre,String email,String id);
    }
    interface registroProfesor{
        int registrar(String nombre,String email);
    }
}
