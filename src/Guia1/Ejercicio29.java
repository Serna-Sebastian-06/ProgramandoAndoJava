package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio29 {
    public static void main(String[] args) {
        String texto = "Algunas noches me cuesta mucho conciliar el sueño, mis pensamientos me atormentan.";

        String acum = "";

        String vertical = "";

        for (int i = 0; i < texto.length(); i++) {
            texto.charAt(i);
            acum += texto.charAt(i) + " ";
            vertical += texto.charAt(i) + "\n";
        }
        String info = "Texto base: \n" + texto + "\nTexto separado por caracteres (y con espcios): \n" + acum + "\nFragmento en vertical: \n" + vertical;
        JOptionPane.showMessageDialog(null, info);
    }
}
