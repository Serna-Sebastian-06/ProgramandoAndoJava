package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio1 {
    public void determinarSigno() {
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número entero:"));

        if (numero > 0) {
            JOptionPane.showMessageDialog(null, "Positivo");
        } else if (numero < 0) {
            JOptionPane.showMessageDialog(null, "Negativo");
        } else {
            JOptionPane.showMessageDialog(null, "Cero");
        }
    }
}