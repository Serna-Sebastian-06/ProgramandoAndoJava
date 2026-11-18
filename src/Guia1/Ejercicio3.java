package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio3 {
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog(null, "Ingrese su edad:");
        int edad = Integer.parseInt(entrada);

        if (edad < 0) {
            JOptionPane.showMessageDialog(null, "Edad invalida");
        } else if (edad >= 18) {
            JOptionPane.showMessageDialog(null, "Puede ingresar");
        } else {
            JOptionPane.showMessageDialog(null, "Acceso denegado");
        }
    }
}