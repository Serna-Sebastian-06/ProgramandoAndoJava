package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio22 {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        StringBuilder salida = new StringBuilder("Elementos del arreglo:\n");

        for (int i = 0; i < numeros.length; i++) {
            salida.append("Indice [").append(i).append("]: ").append(numeros[i]).append("\n");
        }

        JOptionPane.showMessageDialog(null, salida.toString());
    }
}