

import javax.swing.JOptionPane;

import Guia1.GuiaMain;
public class Main {

    public static void main(String[] args) {

        System.out.println("\n--- Bienvenido a Programando Ando ---\n");
        System.out.println("Aquí Aprenderas Java\n");
        System.out.println("Ingrese una opción para el programa: \n");
        System.out.println("1. Ejercicio Guía 1");

        int opcion = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Bienvenido a Programando Ando \n" +
                        "Aquí Aprenderas Java\n" + "Ingrese una opción para el programa: \n" +
                        "1. Ejercicio Guía 1 \n"));

        

        if (opcion == 1) {
            System.out.println("\nIngresando a Ejercicio Guía 1\n");
            GuiaMain Guia1 = new GuiaMain();
            Guia1.Guia1();
        }

    }
}