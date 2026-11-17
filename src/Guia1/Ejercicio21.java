package Guia1;

public class Ejercicio21 {
    public static void main(String[] args) {
        int numero = 7;
        long factorial = 1;

        for (int i = 1; i <= numero; i++) {
            factorial *= i; 
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}