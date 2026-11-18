package Guia1;

import javax.swing.JOptionPane;

/* Simule un login: usuario correcto 'admin', contrasena '1234'. Si coinciden mostrar 'Bienvenido',
si no 'Credenciales incorrectas'. Use equals().
Basico */

public class Ejercicio9 {

    public void LOGIN() {

        String user;
        String paswor;

        // Ventana de entrada para el usuario
        user = JOptionPane.showInputDialog(null, "LOGIN\n\nIngrese el usuario:");

        // Validar si el usuario presionó "Cancelar" o cerró la ventana
        if (user == null) {
            return;
        }

        // Ventana de entrada para la contraseña
        paswor = JOptionPane.showInputDialog(null, "LOGIN\n\nIngrese la contraseña:");

        // Validar si el usuario presionó "Cancelar" o cerró la ventana
        if (paswor == null) {
            return;
        }

        // Evaluación de credenciales con equals()
        if (user.equals("admin") && paswor.equals("1234")) {
            JOptionPane.showMessageDialog(null, "Bienvenido", "Acceso Exitoso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Credenciales incorrectas", "Error de Acceso", JOptionPane.ERROR_MESSAGE);
        }
    }

}