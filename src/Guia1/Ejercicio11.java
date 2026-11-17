package Guia1;

import javax.swing.JOptionPane;

/* Imprimir los numeros del 1 al 50 usando un ciclo for. */

public class Ejercicio11 {

    public void numeros(){

        StringBuilder numerosTexto = new StringBuilder("Lista de números del 1 al 50:\n\n");

        for (int i = 1; i <= 50; i++) {
            numerosTexto.append("Número: ").append(i).append("\n");
        }

        // Mostrar todos los números acumulados en una sola ventana emergente
        JOptionPane.showMessageDialog(null, numerosTexto.toString(), "Números del 1 al 50", JOptionPane.INFORMATION_MESSAGE);
    }

}