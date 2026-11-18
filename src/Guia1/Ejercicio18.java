// Mostrar las tablas de multiplicar del 1 al 10 usando ciclos for anidados

package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio18 {
    
    public void TablasDeMultiplicarDelUnoAlDiez(){

        for (int i = 1; i < 11; i++){
            
            String mensaje = "Tabla de multiplicar del " + i + ":\n" +
                             "------------------------------\n";

            for (int j = 1; j < 11; j++){

                int resultado = i * j;

                mensaje += i + " x " + j + " = " + resultado + "\n";
            }

            JOptionPane.showMessageDialog(null, mensaje);

        }
    }
}