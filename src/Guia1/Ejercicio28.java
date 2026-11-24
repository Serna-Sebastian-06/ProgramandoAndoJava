package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio28 {
    public void MostrarCuboDeNumeros() {
        int num = 20;
        String mensaje = "Números del 1 al 20, con su Cubo((n^3): \n";

        for (int i = 1; i <= num; i++) {
            double resultado = Math.pow(i, 3);
            String cuadro = "Número: " + i + " | " + "Cubo(n^3): " + resultado;
            mensaje += cuadro + "\n";

        }
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
