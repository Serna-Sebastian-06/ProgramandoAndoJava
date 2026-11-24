package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio21 {
    public void calcularFactorial() {
        int numero = 5; // Cambia este valor para probar otros números
        long factorial = 1;

        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        JOptionPane.showMessageDialog(null, "El factorial de " + numero + " es: " + factorial);
    }
}