package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio10 {
    public void CalcularIMC() {
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingreso al ejercicio 10 de la guia 1\nIngrese su peso en kilogramos"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su altura en metros"));

        double IMC = peso / (altura * altura);

        if (IMC < 18.5) {
            JOptionPane.showMessageDialog(null, "Bajo peso");
        } else if (IMC < 25) {
            JOptionPane.showMessageDialog(null, "Peso normal");
        } else if (IMC < 30) {
            JOptionPane.showMessageDialog(null, "Sobrepeso");
        } else {
            JOptionPane.showMessageDialog(null, "Obesidad");
        }
    }
}