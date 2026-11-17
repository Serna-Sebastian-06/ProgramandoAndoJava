// Solicite dos numeros y un operador (+, -, *, /). Realice la operacion con switch. Valide la division entre cero.
package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio4 {

    public void CalculadoraPorSignos() {

        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número"));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número"));
        String operador = JOptionPane.showInputDialog("Ingrese un operador para la operacion (+, -, *, /)");

        switch (operador) {
            case "+":
                double suma;
                suma = numero1 + numero2;
                JOptionPane.showMessageDialog(null, "EL valor de la suma de sus dos números es: " + suma);
                break;

            case "-":
                double resta;
                resta = numero1 - numero2;
                JOptionPane.showMessageDialog(null, "EL valor de la resta de sus dos números es: " + resta);
                break;

            case "*":
                double multiplicacion;
                multiplicacion = numero1 * numero2;
                JOptionPane.showMessageDialog(null, "EL valor de la multiplicación de sus dos número es: " + multiplicacion);
                break;

            case "/":
                if (numero2 == 0) {
                    JOptionPane.showMessageDialog(null, "No se puede dividir por cero");
                } else {
                    double division;
                    division = numero1 / numero2;
                    JOptionPane.showMessageDialog(null, "EL valor de la división de sus dos número es: " + division);
                }
                break;

            default:
                JOptionPane.showMessageDialog(null, "Operación no válida");
                break;
        }

    }
}