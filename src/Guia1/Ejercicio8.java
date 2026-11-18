package Guia1;

import javax.swing.JOptionPane;

/* Solicite el valor de una compra y aplique descuento: >$500.000 = 20%, >$200.000 = 15%, >$100.000 = 10%.
Mostrar valor original, descuento y total. */

public class Ejercicio8 {

    public void CalcularValorDeCompra() {

        double valorDeCompra;
        double descuento;
        double descuentoAplicado;
        int porcentajeDescuento = 0;

        try {
            // Entrada de datos mediante ventana emergente
            String input = JOptionPane.showInputDialog(null, "Ingrese el valor de la compra:");
            
            // Validar si el usuario presionó "Cancelar"
            if (input == null) {
                return;
            }

            // Convertir el texto ingresado a double
            valorDeCompra = Double.parseDouble(input);

            if (valorDeCompra > 500000) {
                porcentajeDescuento = 20;
                descuento = valorDeCompra * 0.20;
                descuentoAplicado = valorDeCompra - descuento;
            } else if (valorDeCompra > 200000) {
                porcentajeDescuento = 15;
                descuento = valorDeCompra * 0.15;
                descuentoAplicado = valorDeCompra - descuento;
            } else if (valorDeCompra > 100000) {
                porcentajeDescuento = 10;
                descuento = valorDeCompra * 0.10;
                descuentoAplicado = valorDeCompra - descuento;
            } else {
                descuentoAplicado = valorDeCompra;
            }

            // Salida de datos mediante JOptionPane
            if (porcentajeDescuento > 0) {
                String mensaje = "FACTURACIÓN DE LA COMPRA\n" +
                                 "--------------------------------------------------\n" +
                                 "El valor original es: $" + valorDeCompra + "\n" +
                                 "El descuento aplicado es del " + porcentajeDescuento + "%\n" +
                                 "El valor final con el descuento es de: $" + descuentoAplicado;
                
                JOptionPane.showMessageDialog(null, mensaje, "Resultado de Facturación", JOptionPane.INFORMATION_MESSAGE);
            } else {
                String mensaje = "FACTURACIÓN DE LA COMPRA\n" +
                                 "--------------------------------------------------\n" +
                                 "La compra no aplica para ningún descuento.\n" +
                                 "El valor de la compra es: $" + valorDeCompra;
                
                JOptionPane.showMessageDialog(null, mensaje, "Resultado de Facturación", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor numérico válido.", "Error de formato", JOptionPane.ERROR_MESSAGE);
        }
    }
}