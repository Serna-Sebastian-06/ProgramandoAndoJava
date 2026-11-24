package Guia2.CatalogoDeVideojuegos;

import Guia2.CatalogoDeVideojuegos.dao.VideojuegoDAO;
import Guia2.CatalogoDeVideojuegos.models.Usuario;
import Guia2.CatalogoDeVideojuegos.views.MenuPrincipalView;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        VideojuegoDAO videojuegoDAO = new VideojuegoDAO();
        videojuegoDAO.crearTablaYDatosIniciales();

        MenuPrincipalView menuView = new MenuPrincipalView(videojuegoDAO);

        boolean ejecutar = true;
        while (ejecutar) {
            Usuario usuarioSesion = realizarLogin();
            if (usuarioSesion == null) {
                break;
            }

            boolean volverALogin = menuView.mostrar(usuarioSesion);
            usuarioSesion = null; // Limpia sesión activa en memoria
            ejecutar = volverALogin;
        }
    }

    // Reemplaza este método por el Login con PreparedStatement de tu equipo
    private static Usuario realizarLogin() {
        int intentos = 0;
        while (intentos < 3) {
            String user = JOptionPane.showInputDialog("Usuario:");
            if (user == null) return null;

            String pass = JOptionPane.showInputDialog("Contraseña:");
            if (pass == null) return null;

            if (("admin".equals(user) && "admin123".equals(pass))
                    || ("empleado".equals(user) && "emp456".equals(pass))) {
                JOptionPane.showMessageDialog(null, "¡Bienvenido, " + user + "!");
                return new Usuario(user, pass);
            }

            intentos++;
            JOptionPane.showMessageDialog(null, "Credenciales incorrectas. Intento " + intentos + " de 3.");
        }

        JOptionPane.showMessageDialog(null, "Se agotaron los 3 intentos.");
        return null;
    }
}