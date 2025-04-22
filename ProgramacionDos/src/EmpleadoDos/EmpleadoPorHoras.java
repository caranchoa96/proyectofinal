/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmpleadoDos;

/**
 *
 * @author Usuario
 */
public class EmpleadoPorHoras extends Empleado{ 
    @Override
    int calcularPago(int salario, int dias, int horas){
        System.out.print("Su pago es: ");
        return salario*(dias*horas);
    }
    @Override
    double calcularPago(int salario, int dias, double horas){
        System.out.print("Su pago es: ");
        return salario*(dias*horas);
    }
}
