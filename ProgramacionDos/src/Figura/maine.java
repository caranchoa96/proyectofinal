/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figura;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class maine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Desea calcular el area de un triangulo, cuadrado o circulo?");
        if(scanner.nextLine().equals("Triangulo")){
            System.out.println("Cual es la longitud de sus lados?");
            Figura t = new Triangulo(scanner.nextInt());
            System.out.println("El area del triangulo: " +t.calcularArea());
        }
        if(scanner.nextLine().equals("Cuadrado")){
            System.out.println("Cual es la longitud de sus lados?");
            Figura t = new Cuadrado(scanner.nextInt());
            System.out.println("El area del cuadrado: " +t.calcularArea());
        }
        if(scanner.nextLine().equals("Circulo")){
            System.out.println("Cual es su area?");
            Figura t = new Circulo(scanner.nextInt());
            System.out.println("El area del triangulo: " +t.calcularArea());
        }
    }
}
