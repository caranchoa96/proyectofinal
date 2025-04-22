/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmpleadoDos;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class Empleado {
    int calcularPago(int salario, int dias){
        return salario*dias;
    }
    int calcularPago(int salario, int dias, int horas){
        return salario*(dias*horas);
    }
    double calcularPago(int salario, int dias, double horas){
        return salario*(dias*horas);
    }
    public static void main(String[] args) {
        Empleado pala;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Va a calcular las horas?");
        String a = scanner.nextLine();
        if(a.equals("Si")||a.equals("si")){
            System.out.println("Tomas las horas puntuales o exactas?");
            System.out.println("1) Puntuales");
            System.out.println("2) Exactas");
            a = scanner.nextLine();
            if(a.equals("1")){
                pala = new EmpleadoPorHoras();
                System.out.println("Digame su salario");
                int salario = scanner.nextInt();
                System.out.println("Digame cuantos dias trabajó");
                int dias = scanner.nextInt();
                System.out.println("Digame cuantas hroas trabajó");
                int horas = scanner.nextInt();
                System.out.println(pala.calcularPago(salario,dias,horas));
            }
            if(a.equals("2")){
                pala = new EmpleadoPorHoras();
                System.out.println("Digame su salario");
                int salario = scanner.nextInt();
                System.out.println("Digame cuantos dias trabajó");
                int dias = scanner.nextInt();
                System.out.println("Digame cuantas horas trabajó");
                double horas = scanner.nextDouble();
                System.out.println(pala.calcularPago(salario,dias,horas));
            }
        }else{
            pala = new Empleado();
            System.out.println("Digame su salario");
            int salario = scanner.nextInt();
            System.out.println("Digame cuantos dias trabajó");
            int dias = scanner.nextInt(); 
            System.out.println("Su paga es: "+pala.calcularPago(salario, dias));
        }
    }
}
