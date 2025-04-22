/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleado;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class Empleado {
    int calcularSalario(int salario, int dias){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Cuantas horas trabaja al dia?");
       int horas = scanner.nextInt();
       return salario*(horas*dias); 
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empleado chamba;
        System.out.println("Usted es empleado a tiempo completo(1) o parcial(2)? o7");
        String a = scanner.nextLine();
        System.out.println("Cuantos dias trabajó?");
        int dias = scanner.nextInt();
        System.out.println("Cuanto le pagan por hora?");
        int salario = scanner.nextInt();
        if(a.equals("1")){
            chamba = new empleadoTiempoCompleto();
            System.out.println("Su salario es "+chamba.calcularSalario(salario, dias));
        }
        if(a.equals("2")){
            chamba = new empleadoMedioTiempo();
            System.out.println("Su salario es "+chamba.calcularSalario(salario, dias));
        }
    }
}
