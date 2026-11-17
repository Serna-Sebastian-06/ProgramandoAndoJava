// Pida una nota entre 0 y 100 y clasifiquela: 90-100 Excelente, 80-89 Bueno, 70-79 Aceptable, 60-69 Insuficiente, <60 Reprobado. Valide el rango.
package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio6 {
    
    public void SistemaDeNotas(){

        int nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una nota entre 0 - 100"));

        if (nota >= 90 && nota <= 100) {
            JOptionPane.showMessageDialog(null, "SUPER EXELENTEE");
        }
        else if(nota <= 89 && nota >= 80){
            JOptionPane.showMessageDialog(null, "Bueno");
        }
        else if(nota <= 79 && nota >= 70){
            JOptionPane.showMessageDialog(null, "Aceptable");
        }
        else if(nota <= 69 && nota >= 60){
            JOptionPane.showMessageDialog(null, "Insuficiente");
        }
        else if (nota >= 0 && nota < 60) {
            JOptionPane.showMessageDialog(null, "Reprobado");
        }
        else {
            JOptionPane.showMessageDialog(null, "Nota inválida; Ingrese una nota válida entre 0 - 100");
        }
    }
}