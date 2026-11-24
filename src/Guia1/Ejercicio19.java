package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio19 {
    public void contarMultiplosDeDiez() {
        int contador = 0;

        for (int i = 1; i <= 200; i++) {
            if (i % 10 == 0) {
                contador++;
            }
        }

        JOptionPane.showMessageDialog(null, "Cantidad de multiplos de 10 entre 1 y 200: " + contador);
    }
}