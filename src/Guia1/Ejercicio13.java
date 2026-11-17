package Guia1;

import javax.swing.JOptionPane;

/* Imprimir todos los numeros pares del 1 al 100 usando un ciclo for. */

public class Ejercicio13 {
    
    public void Pares100 () {

        StringBuilder numerosTexto = new StringBuilder("Números pares del 1 al 100:\n\n");

        for (int i = 2; i <= 100; i += 2) {
            numerosTexto.append("Número: ").append(i).append("\n");
        }

        // Mostrar todos los números pares acumulados en una sola ventana emergente
        JOptionPane.showMessageDialog(null, numerosTexto.toString(), "Números Pares", JOptionPane.INFORMATION_MESSAGE);
    }
}