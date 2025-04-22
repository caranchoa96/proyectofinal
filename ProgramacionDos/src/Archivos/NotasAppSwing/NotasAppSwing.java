/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archivos.NotasAppSwing;

/**
 *
 * @author Usuario
 */
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ArrayList;
public class NotasAppSwing extends JFrame {
    private DefaultListModel<Nota> modeloNotas;
    private JList<Nota> listaNotas;
    private JTextArea areaContenido;
    private List<Nota> notas;
    public NotasAppSwing() {
        super("\uD83D\uDCD2 Notas");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        notas = GestorNotas.cargarNotas();
        modeloNotas = new DefaultListModel<>();
        notas.forEach(modeloNotas::addElement);
        listaNotas = new JList<>(modeloNotas);
        listaNotas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listaNotas.addListSelectionListener(e -> mostrarContenido());
        areaContenido = new JTextArea();
        areaContenido.setEditable(false);
        JButton btnAgregar = new JButton("Agregar");
        btnAgregar.addActionListener(e -> agregarNota());
        JButton btnEliminar = new JButton("Eliminar");
        btnEliminar.addActionListener(e -> eliminarNota());
        JButton btnEditar = new JButton("Editar");
        btnEditar.addActionListener(e -> editarNota());
        JPanel panelBotones = new JPanel();
        panelBotones.add(btnAgregar);
        panelBotones.add(btnEliminar);
        panelBotones.add(btnEditar);
        add(new JScrollPane(listaNotas), BorderLayout.WEST);
        add(new JScrollPane(areaContenido), BorderLayout.CENTER);
        add(panelBotones, BorderLayout.SOUTH);
        setVisible(true);
    }
    private void mostrarContenido() {
        Nota seleccionada = listaNotas.getSelectedValue();
        if (seleccionada != null) {
            areaContenido.setText(seleccionada.getContenido());
        }
    }
    private void agregarNota() {
        String titulo = JOptionPane.showInputDialog(this, "Título de la nota:");
            if (titulo == null || titulo.isEmpty()) return;
                String contenido = JOptionPane.showInputDialog(this, "Contenido de la nota:");
            if (contenido == null || contenido.isEmpty()) return;
                Nota nueva = new Nota(titulo, contenido);
                notas.add(nueva);
                modeloNotas.addElement(nueva);
                GestorNotas.guardarNotas(notas);
    }
    private void eliminarNota() {
        int index = listaNotas.getSelectedIndex();
        if (index >= 0) {
            Nota notaSeleccionada = listaNotas.getSelectedValue();
            int confirmacion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas eliminar la nota:\n\"" +
            notaSeleccionada.getTitulo() + "\"?", "Confirmar eliminación",JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) {
            notas.remove(index);
            modeloNotas.remove(index);
            areaContenido.setText("");
            GestorNotas.guardarNotas(notas);
            JOptionPane.showMessageDialog(this, "\uD83D\uDDD1️ Nota eliminada.");
        }
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una nota para eliminar.");
        }
    }
    private void editarNota() {
        int index = listaNotas.getSelectedIndex();
        if (index >= 0) {
            Nota nota = notas.get(index);
            String nuevoTitulo = JOptionPane.showInputDialog(this, "Editar título:",nota.getTitulo());
            if (nuevoTitulo == null || nuevoTitulo.isEmpty()) return;
                String nuevoContenido = JOptionPane.showInputDialog(this, "Editar contenido:", nota.getContenido());
                if (nuevoContenido == null || nuevoContenido.isEmpty()) return;
                    Nota notaEditada = new Nota(nuevoTitulo, nuevoContenido);
                    notas.set(index, notaEditada);
                    modeloNotas.set(index, notaEditada);
                    areaContenido.setText(nuevoContenido);
                    GestorNotas.guardarNotas(notas);
                    JOptionPane.showMessageDialog(this, " Nota actualizada.");
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una nota para editar.");
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(NotasAppSwing::new);
    }
}
