package Guia2.CatalogoDeVideojuegos.views;

import javax.swing.JOptionPane;
import Guia2.CatalogoDeVideojuegos.controller.loginController;

public class LoginView {

    private String usuarioSesion = null;

    public void mostrarLogin() {
        loginController controller = new loginController();
        int intentos = 0;
        final int MAX_INTENTOS = 3;

        while (intentos < MAX_INTENTOS) {
            String user = JOptionPane.showInputDialog(null,
                "Usuario:",
                "Iniciar Sesión (Intento " + (intentos + 1) + " de " + MAX_INTENTOS + ")",
                JOptionPane.QUESTION_MESSAGE);

            if (user == null) {
                usuarioSesion = null;
                JOptionPane.showMessageDialog(null, "Inicio de sesión cancelado.");
                return;
            }

            String pass = JOptionPane.showInputDialog(null,
                "Contraseña:",
                "Iniciar Sesión (Intento " + (intentos + 1) + " de " + MAX_INTENTOS + ")",
                JOptionPane.QUESTION_MESSAGE);

            if (pass == null) {
                usuarioSesion = null;
                JOptionPane.showMessageDialog(null, "Inicio de sesión cancelado.");
                return;
            }

            if (controller.login(user.trim(), pass)) {
                usuarioSesion = user.trim();
                intentos = 0; // Reinicia intentos para el próximo usuario

                JOptionPane.showMessageDialog(null,
                    "¡Bienvenido, " + usuarioSesion + "!",
                    "Acceso Concedido", JOptionPane.INFORMATION_MESSAGE);

                MenuPrincipalView menu = new MenuPrincipalView();
                menu.mostrarMenu(usuarioSesion);

                // Al cerrar sesión en el menú, limpia memoria y el while vuelve a pedir Login
                usuarioSesion = null;
            } else {
                intentos++;
                int restantes = MAX_INTENTOS - intentos;

                if (restantes > 0) {
                    JOptionPane.showMessageDialog(null,
                        "Credenciales incorrectas. Te quedan " + restantes + " intento(s).",
                        "Error de Autenticación", JOptionPane.WARNING_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null,
                        "Has superado el máximo de 3 intentos. El programa se cerrará.",
                        "Acceso Bloqueado", JOptionPane.ERROR_MESSAGE);
                    System.exit(0);
                }
            }
        }
    }
}