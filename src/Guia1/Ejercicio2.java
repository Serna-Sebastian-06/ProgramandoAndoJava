package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio2 {
    public void parOImpar() {
        String entrada = JOptionPane.showInputDialog(null, "Ingrese un número entero:");
        int numero = Integer.parseInt(entrada);

        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "El número " + numero + " es Par");
        } else {
            JOptionPane.showMessageDialog(null, "El número " + numero + " es Impar");
        }
    }
}