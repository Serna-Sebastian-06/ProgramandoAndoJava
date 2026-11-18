package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio2 {
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog(null, "Ingrese un numero entero:");
        int numero = Integer.parseInt(entrada);

        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "El numero " + numero + " es Par");
        } else {
            JOptionPane.showMessageDialog(null, "El numero " + numero + " es Impar");
        }
    }
}