/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archivos.NotasAppSwing;

/**
 *
 * @author Usuario
 */
public class Nota {
    private String titulo;
    private String contenido;
    public Nota(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getContenido() {
        return contenido;
    }
    @Override
    public String toString() {
        return titulo;
    }
}

