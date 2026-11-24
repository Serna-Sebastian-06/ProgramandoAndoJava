package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio25 {
    public void EncontrarMenorEnArreglo() {
        int arreglo[] = { 11, 22, 33, 44, 55, 66, 77, 88, 9, 100 };

        int menor = arreglo[0];

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] < menor) {
                menor = arreglo[i];
            }
        }
        JOptionPane.showMessageDialog(null, "Número menor: " + menor);
    }
}
