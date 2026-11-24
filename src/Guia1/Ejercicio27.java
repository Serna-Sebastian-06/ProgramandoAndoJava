package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio27 {
    public void ImprimirCuadradoDeAsteriscos() {
        String caracter = "* ";
        int filas = 6;
        int columnas = 6;
        String resultado = "";

        for (int fila = 1; fila <= filas; fila++) {
            for (int columna = 1; columna <= columnas; columna++) {
                resultado += caracter;
            }
            resultado += "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
}
