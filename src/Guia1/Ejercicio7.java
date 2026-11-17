package Guia1;

import javax.swing.JOptionPane;

// Solicite tres numeros e imprima cual es el mayor. Extra: si hay empate entre dos o los tres, indicarlo.

public class Ejercicio7 {

    public void CalcularMayor() {

        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número: "));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número: "));
        double num3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tercer número: "));

        if (num1 == num2 && num2 == num3) {
            JOptionPane.showMessageDialog(null, "Empate total: Los tres números son iguales a " + num1);
        } else if (num1 == num2 && num1 > num3) {
            JOptionPane.showMessageDialog(null, "Empate parcial: El primer y segundo número son los mayores (" + num1 + ")");
        } else if (num1 == num3 && num1 > num2) {
            JOptionPane.showMessageDialog(null, "Empate parcial: El primer y tercer número son los mayores (" + num1 + ")");
        } else if (num2 == num3 && num2 > num1) {
            JOptionPane.showMessageDialog(null, "Empate parcial: El segundo y tercer número son los mayores (" + num2 + ")");
        } else if (num1 > num2 && num1 > num3) {
            JOptionPane.showMessageDialog(null, "El número mayor es el primero: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            JOptionPane.showMessageDialog(null, "El número mayor es el segundo: " + num2);
        } else {
            JOptionPane.showMessageDialog(null, "El número mayor es el tercero: " + num3);
        }
    }
}