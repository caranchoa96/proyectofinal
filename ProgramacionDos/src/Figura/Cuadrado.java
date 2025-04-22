/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figura;

/**
 *
 * @author Usuario
 */
public class Cuadrado extends Figura{
    private double longitud;
    Cuadrado(int longitud){
        this.longitud = longitud;
    }
    @Override
    public double calcularArea() {
        return longitud*4;
    }
}
