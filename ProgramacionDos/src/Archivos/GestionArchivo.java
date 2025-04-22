/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archivos;

/**
 *
 * @author Usuario
 */
import java.io.File;
import java.io.IOException;
public class GestionArchivo {
    public static void main(String[] args) {
        File archivo = new File("archivo.txt");
        // Crear
        try {
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado: " + archivo.getName());
            } else {
                System.out.println("El archivo ya existe.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Verificar
        if (archivo.exists()) {
            System.out.println("Nombre: " + archivo.getName());
            System.out.println("Ruta: " + archivo.getAbsolutePath());
        }
        
    }
}

