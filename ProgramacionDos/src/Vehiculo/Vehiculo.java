/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Vehiculo;

/**
 *
 * @author Usuario
 */
public class Vehiculo {
    void mover(){
        System.out.println("Me muevo con o sin ruedas =) ");
    }
    public static void main(String[] args) {
        Vehiculo runrun;
        runrun = new Avion(); 
        runrun.mover();
        runrun = new Bicicleta(); 
        runrun.mover(); 
        runrun = new Carro(); 
        runrun.mover(); 
    }
}
