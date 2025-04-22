/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colecciones;

/**
 *
 * @author Usuario
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
public class VentanaVotacion extends JFrame {
    private JTextField campoNombre;
    private JComboBox<String> comboCandidatos;
    private JTextArea areaResultados;
    private Votacion votacion;
    public VentanaVotacion() {
        votacion = new Votacion();
        setTitle("Sistema de Votación");
        setSize(450, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JLabel etiquetaNombre = new JLabel("Tu nombre:");
        campoNombre = new JTextField(12);
        JLabel etiquetaCandidato = new JLabel("Elige un candidato:");
        comboCandidatos = new JComboBox<>(new String[]{"Ana", "Carlos","Lucía"});
        JButton botonVotar = new JButton("Votar");
        JButton botonHistorial = new JButton("Ver historial");
        JButton botonReiniciar = new JButton("Reiniciar elecciones");
        areaResultados = new JTextArea(10, 35);
        areaResultados.setEditable(false);
        JScrollPane scroll = new JScrollPane(areaResultados);
        JPanel panelSuperior = new JPanel();
        panelSuperior.add(etiquetaNombre);
        panelSuperior.add(campoNombre);
        panelSuperior.add(etiquetaCandidato);
        panelSuperior.add(comboCandidatos);
        panelSuperior.add(botonVotar);
        panelSuperior.add(botonHistorial);
        panelSuperior.add(botonReiniciar);
        setLayout(new BorderLayout());
        add(panelSuperior, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);
        botonVotar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = campoNombre.getText().trim();
                String candidato = (String) comboCandidatos.getSelectedItem();
                if (nombre.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor, escribe tu nombre.");
                    return;
                }
                boolean exito = votacion.votar(nombre, candidato);
                if (exito) {
                    JOptionPane.showMessageDialog(null, "¡Voto registrado!");
                } else {
                    JOptionPane.showMessageDialog(null, "Ya has votado o el candidato no es válido.");
                }
                mostrarResultados();
            }});
        botonHistorial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb = new StringBuilder(" Historial de votos:\n");
                if (votacion.getHistorialVotos().isEmpty()) {
                    sb.append("Aún no hay votos registrados.");
                } else {
                for (String registro : votacion.getHistorialVotos()) {
                    sb.append("• ").append(registro).append("\n");
                }}
                JOptionPane.showMessageDialog(null, sb.toString());
            }
        });
        botonReiniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int confirm = JOptionPane.showConfirmDialog(null,"¿Estás seguro de que quieres reiniciar las elecciones?","Confirmar reinicio", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    votacion.reiniciar();
                    campoNombre.setText("");
                    areaResultados.setText("");
                    JOptionPane.showMessageDialog(null, "¡Elecciones reiniciadas!");
                }
            }
        });
    }
    private void mostrarResultados() {
        StringBuilder sb = new StringBuilder("Resultados actuales:\n");
        Map<String, Integer> resultados = votacion.getResultados();
        String ganador = "";
        int maxVotos = -1;
        for (Map.Entry<String, Integer> entry : resultados.entrySet()) {
            sb.append(entry.getKey()).append(": ").append(entry.getValue()).append("votos\n");
            if (entry.getValue() > maxVotos) {
                maxVotos = entry.getValue();
                ganador = entry.getKey();
            }
        }
        if (maxVotos > 0) {
            sb.append("\n Ganador actual: ").append(ganador).append(" con ").append(maxVotos).append(" votos");
        } else {
            sb.append("\nAún no hay votos.");
        }
        areaResultados.setText(sb.toString());
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new VentanaVotacion().setVisible(true);
        });
    }
}

