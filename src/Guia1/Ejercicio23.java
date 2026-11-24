package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio23 {
    public void SumarElementosArreglo() {
        int acum = 0;

        int arreglo[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for (int i = 0; i < arreglo.length; i++) {
            acum += arreglo[i];
        }
        JOptionPane.showMessageDialog(null, "La suma de los elementos del arreglo es: " + acum);
    }
}
