package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio24 {
    public void EncontrarMayorEnArreglo() {
        int arreglo[] = { 11, 22, 33, 44, 55, 66, 77, 88, 99, 100 };

        int mayor = arreglo[0];

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > mayor) {
                mayor = arreglo[i];
            }
        }
        JOptionPane.showMessageDialog(null, "Número mayor: " + mayor);
    }

}