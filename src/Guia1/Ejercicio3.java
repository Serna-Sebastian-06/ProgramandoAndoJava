package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio3 {
    public void validarEdad() {
        String entrada = JOptionPane.showInputDialog(null, "Ingrese su edad:");
        int edad = Integer.parseInt(entrada);

        if (edad < 0) {
            JOptionPane.showMessageDialog(null, "Edad inválida");
        } else if (edad >= 18) {
            JOptionPane.showMessageDialog(null, "Puede ingresar");
        } else {
            JOptionPane.showMessageDialog(null, "Acceso denegado");
        }
    }
}