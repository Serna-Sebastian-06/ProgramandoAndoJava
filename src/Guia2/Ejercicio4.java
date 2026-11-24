package Guia2;

import javax.swing.JOptionPane;

public class Ejercicio4 {
    public void AccesoArreglo() {
        String[] nombres = { "Ana", "Luis", "Maria", "Pedro", "Sofia" };
        int maxIndice = nombres.length - 1;

        try {
            int i = Integer.parseInt(JOptionPane.showInputDialog(null, "Posición (0 a " + maxIndice + "):"));
            JOptionPane.showMessageDialog(null, "Nombre: " + nombres[i]);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingresa un número entero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Posición inválida. Solo existen posiciones 0 a " + maxIndice + ".");
        }
    }
}
