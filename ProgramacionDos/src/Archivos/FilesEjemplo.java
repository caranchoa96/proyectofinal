/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archivos;

/**
 *
 * @author Usuario
 */
import java.nio.file.*;
import java.io.IOException;
import java.util.List;
public class FilesEjemplo {
    public static void main(String[] args) throws IOException {
    // Escribir
    Files.write(Paths.get("nuevo.txt"), "Texto con NIO".getBytes());
    // Leer todo el archivo como líneas
    List<String> lineas = Files.readAllLines(Paths.get("nuevo.txt"));
    lineas.forEach(System.out::println);
    }
}
