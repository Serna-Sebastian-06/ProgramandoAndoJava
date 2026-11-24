package Guia2.CatalogoDeVideojuegos.views;

import javax.swing.JOptionPane;

public class MenuPrincipalView {

    private String usuarioActivo = null;

    public void mostrarMenu(String usuario) {
        this.usuarioActivo = usuario;
        int opcion = 0;

        while (opcion != 5) {
            String input = JOptionPane.showInputDialog(null,
                "Catálogo de Videojuegos — Sesión: " + usuarioActivo + "\n\n" +
                "1. Listar videojuegos\n" +
                "2. Registrar videojuego\n" +
                "3. Actualizar videojuego\n" +
                "4. Eliminar videojuego\n" +
                "5. Cerrar sesión",
                "Menú Principal", JOptionPane.PLAIN_MESSAGE);

            if (input == null) {
                cerrarSesion();
                break;
            }

            try {
                opcion = Integer.parseInt(input.trim());

                switch (opcion) {
                    case 1 -> vistaListarVideojuegos();
                    case 2 -> vistaRegistrarVideojuego();
                    case 3 -> vistaActualizarVideojuego();
                    case 4 -> vistaEliminarVideojuego();
                    case 5 -> cerrarSesion();
                    default -> JOptionPane.showMessageDialog(null, "Opción no válida. Elige entre 1 y 5.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingresa un número válido.");
            }
        }
    }

    private void cerrarSesion() {
        this.usuarioActivo = null;
        JOptionPane.showMessageDialog(null, "Sesión cerrada correctamente.");
    }

    // ================= ESTRUCTURA BASE PARA EL CRUD =================

    private void vistaListarVideojuegos() {
        JOptionPane.showMessageDialog(null, "Pendiente: Módulo Listar (Read).");
    }

    private void vistaRegistrarVideojuego() {
        JOptionPane.showMessageDialog(null, "Pendiente: Módulo Registrar (Create).");
    }

    private void vistaActualizarVideojuego() {
        JOptionPane.showMessageDialog(null, "Pendiente: Módulo Actualizar (Update).");
    }

    private void vistaEliminarVideojuego() {
        JOptionPane.showMessageDialog(null, "Pendiente: Módulo Eliminar (Delete).");
    }
}