/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleado;

/**
 *
 * @author Usuario
 */
public class empleadoMedioTiempo extends Empleado{
    @Override
    int calcularSalario(int salario, int dias){
        return salario*(dias*4);
    }
}
