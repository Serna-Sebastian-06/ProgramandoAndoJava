package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio20 {
    public void divisiblesTresYCinco() {
        StringBuilder resultado = new StringBuilder("Numeros del 1 al 100 divisibles entre 3 y 5:\n");

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                resultado.append(i).append("\n");
            }
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}