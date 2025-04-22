/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archivos;

/**
 *
 * @author Usuario
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class LeerArchivo {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("archivo.txt"))) {
        String linea;
        while ((linea = reader.readLine()) != null) {
            System.out.println(linea);
        }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

