package Guia1;

import java.util.Scanner;

/* Solicite el valor de una compra y aplique descuento: >$500.000 = 20%, >$200.000 = 15%, >$100.000 = 10%.
Mostrar valor original, descuento y total. */

public class Ejercicio8 {

    public void CalcularValorDeCompra() {

        double ValorDeCompra;

        double Descuento;

        double DescuentoAplicado;

        Scanner valor = new Scanner(System.in);

        System.out.println("Ingrese el valor de la compra");

        ValorDeCompra = valor.nextDouble();

        System.out.println("FACTURACIÓN DE LA COMPRA");

        if (ValorDeCompra > 500000) {

            Descuento = ValorDeCompra * 0.20;

            DescuentoAplicado = ValorDeCompra - Descuento;

            System.out.printf("EL valor original es:" + ValorDeCompra);
            System.out.println("EL descuento aplicado es del 20%");
            System.out.printf("EL valor final con el descuento aplicado es de :" + DescuentoAplicado);

        } else if (ValorDeCompra > 200000) {

            Descuento = ValorDeCompra * 0.15;

            DescuentoAplicado = ValorDeCompra - Descuento;

            System.out.printf("EL valor original es:" + ValorDeCompra);
            System.out.println("EL descuento aplicado es del 15%");
            System.out.printf("EL valor final con el descuento aplicado es de:" + DescuentoAplicado);

        } else if (ValorDeCompra > 100000) {

            Descuento = ValorDeCompra * 0.10;

            DescuentoAplicado = ValorDeCompra - Descuento;

            System.out.printf("El valor original es:" + ValorDeCompra);
            System.out.println("EL descuento aplicado es del 10%");
            System.out.printf("El valor final es:" + DescuentoAplicado);

        } else {

            System.out.println("La compra no aplica para ningún descuento.");
            System.out.printf("El valor de la compra es:" + ValorDeCompra);
        }
        valor.close();
    }
}