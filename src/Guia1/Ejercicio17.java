// Mostrar la tabla de multiplicar del numero 7 usando un ciclo for

package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio17 {

    public void TablaDeMultiplicar7() {

        int numero = 7;
        String mensaje = "Tabla de multiplicar del " + numero + ":\n" +
                "------------------------------\n";

        for (int i = 1; i < 11; i++) {

            int resultado = numero * i;

            mensaje += numero + " x " + i + " = " + resultado + "\n";
        }

        JOptionPane.showMessageDialog(null, mensaje);
    }
}