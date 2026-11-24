package Guia2.CatalogoDeVideojuegos.views;

import javax.swing.JOptionPane;
import Guia2.CatalogoDeVideojuegos.controller.loginController;
import Guia2.CatalogoDeVideojuegos.dao.VideojuegoDAO;
import Guia2.CatalogoDeVideojuegos.models.Usuario;

public class LoginView {

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
                JOptionPane.showMessageDialog(null, "Inicio de sesión cancelado.");
                return;
            }

            String pass = JOptionPane.showInputDialog(null,
                    "Contraseña:",
                    "Iniciar Sesión (Intento " + (intentos + 1) + " de " + MAX_INTENTOS + ")",
                    JOptionPane.QUESTION_MESSAGE);

            if (pass == null) {
                JOptionPane.showMessageDialog(null, "Inicio de sesión cancelado.");
                return;
            }

            if (controller.login(user.trim(), pass)) {
                JOptionPane.showMessageDialog(null,
                        "¡Bienvenido, " + user.trim() + "!",
                        "Acceso Concedido", JOptionPane.INFORMATION_MESSAGE);

                VideojuegoDAO dao = new VideojuegoDAO();
                dao.crearTablaYDatosIniciales();

                MenuPrincipalView menu = new MenuPrincipalView(dao);
                Usuario usuarioActivo = new Usuario(user.trim(), "");

                boolean volverALogin = menu.mostrar(usuarioActivo);
                if (!volverALogin) {
                    return;
                }
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