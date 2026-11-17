package Guia1;

import javax.swing.JOptionPane;

/* Mostrar los numeros del 50 al 1 usando un ciclo for. */
public class Ejercicio12 {

    public void numeros50a1() {

        StringBuilder numerosTexto = new StringBuilder("Cuenta regresiva del 50 al 1:\n\n");

        for (int i = 50; i >= 1; i--) {
            numerosTexto.append("Número: ").append(i).append("\n");
        }

        // Mostrar todos los números acumulados en una sola ventana emergente
        JOptionPane.showMessageDialog(null, numerosTexto.toString(), "Números del 50 al 1", JOptionPane.INFORMATION_MESSAGE);
    }

}