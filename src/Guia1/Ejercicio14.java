package Guia1;

import javax.swing.JOptionPane;

/* Imprimir todos los numeros impares del 1 al 100 usando un ciclo while. */

public class Ejercicio14 {
    
    public void NumerosImparesWH(){

        int contador = 1;
        StringBuilder numerosTexto = new StringBuilder("Números impares del 1 al 100:\n\n");

        while (contador <= 100) {
            numerosTexto.append("Número: ").append(contador).append("\n");
            contador += 2;
        }

        // Mostrar todos los números impares acumulados en una sola ventana emergente
        JOptionPane.showMessageDialog(null, numerosTexto.toString(), "Números Impares", JOptionPane.INFORMATION_MESSAGE);
    }

}