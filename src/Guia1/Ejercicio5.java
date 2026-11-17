package Guia1;

import javax.swing.JOptionPane;

// Pida un anio y determine si es bisiesto. Reglas: divisible entre 4, no entre 100, excepto si es divisible entre 400

public class Ejercicio5 {

    public void CalcularAnioBisiesto() {

        int anio = Integer.parseInt(JOptionPane.showInputDialog(
                "Ingrese un año para ver si es bisiesto: "));

        if (anio % 4 == 0 && anio % 100 != 0) {
            JOptionPane.showMessageDialog(null, "El año ingredaso es bisiesto: " + anio);

        } else {
            JOptionPane.showMessageDialog(null, "El año no es bisiesto: " + anio);
        }
    }
}
