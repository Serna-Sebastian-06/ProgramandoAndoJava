import javax.swing.JOptionPane;

import Guia1.GuiaMain;
import Guia2.Guia2Main;

public class Main {

    public static void main(String[] args) {

        int opcion = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Bienvenido a Programando Ando \n" +
                        "Aquí Aprenderas Java\n" + "Ingrese una opción para el programa: \n" +
                        "1. Ejercicio Guía 1 \n" +
                        "2. Ejercicio Guía 2"));

        if (opcion == 1) {
            System.out.println("\nIngresando a Ejercicio Guía 1\n");
            GuiaMain Guia1 = new GuiaMain();
            Guia1.Guia1();
        }

        if (opcion == 2) {
            System.out.println("\nIngresando a Ejercicio Guía 2\n");
            Guia2Main Guia2 = new Guia2Main();
            Guia2.Guia2();
        }

    }
}