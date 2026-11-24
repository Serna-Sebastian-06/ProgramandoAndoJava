package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio26 {
    public void ContarNumeroEnArreglo() {
        String num = JOptionPane.showInputDialog("Ingrese un número entre 1 y 50: ");
        int numero = Integer.parseInt(num);

        int arreglo[] = { 12, 45, 3, 28, 19, 7, 50, 34, 15, 42,
                8, 23, 19, 31, 4, 48, 27, 11, 39, 15,
                2, 36, 45, 21, 9, 50, 14, 29, 33, 7,
                18, 41, 25, 6, 47, 15, 32, 10, 44, 20,
                1, 38, 26, 13, 49, 19, 35, 24, 40, 17,
                5, 30, 46, 22, 15, 37, 16, 43, 28, 7 };

        int contador = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == numero) {
                contador++;
            }
        }
        JOptionPane.showMessageDialog(null, "El número " + numero + " aparece " + contador + " veces en el arreglo.");
    }
}
