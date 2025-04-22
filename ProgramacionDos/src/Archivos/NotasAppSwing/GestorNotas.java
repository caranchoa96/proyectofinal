/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archivos.NotasAppSwing;

/**
 *
 * @author Usuario
 */
import java.io.*;
import java.util.*;
public class GestorNotas {
    private static final String ARCHIVO = "notas.txt";
    public static List<Nota> cargarNotas() {
    List<Nota> notas = new ArrayList<>();
    File archivo = new File(ARCHIVO);
    if (!archivo.exists()) return notas;
        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO)))
    {
    String linea;
    while ((linea = reader.readLine()) != null) {
        String[] partes = linea.split(";", 2);
        if (partes.length == 2) {
            notas.add(new Nota(partes[0], partes[1]));
        }
    }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return notas;
    }
    public static void guardarNotas(List<Nota> notas) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO))) {
            for (Nota nota : notas) {
                writer.write(nota.getTitulo() + ";" + nota.getContenido());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


