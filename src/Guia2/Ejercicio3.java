package Guia2;

import javax.swing.JOptionPane;

public class Ejercicio3 {
    public void CalculadoraIMC() {
        try {
            double peso = Double.parseDouble(
                    JOptionPane.showInputDialog(null, "Peso (kg):"));
            double altura = Double.parseDouble(
                    JOptionPane.showInputDialog(null, "Estatura (m):"));

            if (altura == 0) {
                throw new ArithmeticException("La estatura no puede ser 0");
            }

            double imc = peso / (altura * altura);
            JOptionPane.showMessageDialog(null,
                    "IMC: " + String.format("%.2f", imc));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "Dato inválido. Usa punto decimal. Ej: 1.70");
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
}
