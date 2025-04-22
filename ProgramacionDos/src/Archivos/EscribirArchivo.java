/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archivos;

/**
 *
 * @author Usuario
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class EscribirArchivo {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("archivo.txt", true))) {
            writer.write("Hola, mundo!");
            writer.newLine(); // Para salto de línea
            } catch (IOException e) {
                e.printStackTrace();
        }
    }
}

