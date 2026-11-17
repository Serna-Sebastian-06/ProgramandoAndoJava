package Guia1;

public class Ejercicio20 {
    public static void main(String[] args) {
        System.out.println("Numeros del 1 al 100 divisibles entre 3 y 5:");
        
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}