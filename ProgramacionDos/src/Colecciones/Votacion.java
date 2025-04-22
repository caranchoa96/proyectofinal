/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colecciones;

/**
 *
 * @author Usuario
 */
import java.util.*;
public class Votacion {
    private Set<String> votantes;
    private Map<String, Integer> votos;
    private List<String> historialVotos;
    private Queue<String> colaVotantes;
    public Votacion() {
        votantes = new HashSet<>();
        votos = new HashMap<>();
        historialVotos = new ArrayList<>();
        colaVotantes = new LinkedList<>();
        votos.put("Ana", 0);
        votos.put("Carlos", 0);
        votos.put("Lucía", 0);
    }
    public boolean votar(String nombreVotante, String candidato) {
        if (votantes.contains(nombreVotante)) {
            return false;
        }
        if (votos.containsKey(candidato)) {
            votos.put(candidato, votos.get(candidato) + 1);
            votantes.add(nombreVotante);
            historialVotos.add(nombreVotante + " votó por " + candidato);
            colaVotantes.remove(nombreVotante);
            return true;
        }
        return false;
    }
    public Map<String, Integer> getResultados() {
        return votos;
    }
    public List<String> getHistorialVotos() {
        return historialVotos;
    }
    public Queue<String> getColaVotantes() {
        return colaVotantes;
    }
    public void reiniciar() {
        votantes.clear();
        historialVotos.clear();
        colaVotantes.clear();
        for (String candidato : votos.keySet()) {
            votos.put(candidato, 0);
        }
    }
}

