package Guia1;

import javax.swing.JOptionPane;

/* Calcular la suma de los numeros del 1 al 100 usando un ciclo for.
Basico */
public class Ejercicio15 {

     public void Suma1a100() {

        int suma = 0;

        for (int i = 1; i <= 100; i++) {
            suma += i;
        }

        // Mostrar el resultado de la suma en una ventana emergente
        JOptionPane.showMessageDialog(null, "La suma de los números del 1 al 100 es de: " + suma, "Suma Total", JOptionPane.INFORMATION_MESSAGE);
    } 

}