package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio1 {
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog(null, "Ingrese un numero entero:");
        int numero = Integer.parseInt(entrada);

        if (numero > 0) {
            JOptionPane.showMessageDialog(null, "Positivo");
        } else if (numero < 0) {
            JOptionPane.showMessageDialog(null, "Negativo");
        } else {
            JOptionPane.showMessageDialog(null, "Cero");
        }
    }
}