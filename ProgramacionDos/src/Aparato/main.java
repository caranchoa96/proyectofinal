/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aparato;

/**
 *
 * @author Usuario
 */
public class main {
    public static void main(String[] args) {
        DispositivoElectronico bafle;
        bafle = new Computadora();
        bafle.encender();
        bafle = new Televisor();
        bafle.encender();
    }
}
