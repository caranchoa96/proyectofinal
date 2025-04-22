/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Swing;

/**
 *
 * @author Usuario
 */
import javax.swing.*;
public class FormularioRegistro {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Formulario de Registro");
        ventana.setSize(400, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new BoxLayout(ventana.getContentPane(), BoxLayout.Y_AXIS)); //Layout en columna
        // Nombre
        JPanel panelNombre = new JPanel();
        panelNombre.add(new JLabel("Nombre:"));
        JTextField campoNombre = new JTextField(20);
        panelNombre.add(campoNombre);
        ventana.add(panelNombre);
        // Edad
        JPanel panelEdad = new JPanel();
        panelEdad.add(new JLabel("Edad:"));
        JTextField campoEdad = new JTextField(5);
        panelEdad.add(campoEdad);
        ventana.add(panelEdad);
        // Género
        JPanel panelGenero = new JPanel();
        panelGenero.add(new JLabel("Género:"));
        JRadioButton radioM = new JRadioButton("Masculino");
        JRadioButton radioF = new JRadioButton("Femenino");
        ButtonGroup grupoGenero = new ButtonGroup();
        grupoGenero.add(radioM);
        grupoGenero.add(radioF);
        panelGenero.add(radioM);
        panelGenero.add(radioF);
        ventana.add(panelGenero);
        // Lenguajes favoritos
        JPanel panelLenguajes = new JPanel();
        panelLenguajes.add(new JLabel("Lenguajes:"));
        JCheckBox java = new JCheckBox("Java");
        JCheckBox python = new JCheckBox("Python");
        JCheckBox js = new JCheckBox("JavaScript");
        panelLenguajes.add(java);
        panelLenguajes.add(python);
        panelLenguajes.add(js);
        ventana.add(panelLenguajes);
        // Botón enviar
        JButton boton = new JButton("Enviar");
        boton.addActionListener(e -> {
            String nombre = campoNombre.getText();
            String edad = campoEdad.getText();
            String genero = radioM.isSelected() ? "Masculino" : radioF.isSelected() ? "Femenino" : "No especificado";
            StringBuilder lenguajes = new StringBuilder();
            if (java.isSelected()) lenguajes.append("Java ");
            if (python.isSelected()) lenguajes.append("Python ");
            if (js.isSelected()) lenguajes.append("JavaScript ");
            String mensaje = "Nombre: " + nombre + "\nEdad: " + edad + "\nGénero: " + genero + "\nLenguajes: " + lenguajes; 
            JOptionPane.showMessageDialog(ventana, mensaje);
        });
        ventana.add(boton);
        ventana.setVisible(true);
    }
}
