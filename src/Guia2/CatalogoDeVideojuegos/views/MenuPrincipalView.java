package Guia2.CatalogoDeVideojuegos.views;

import javax.swing.JOptionPane;

public class MenuPrincipalView {

    public void mostrarMenu(String usuario) {
        int opcion = 0;

        while (opcion != 5) {
            String input = JOptionPane.showInputDialog(null,
                "Catálogo de Videojuegos — Sesión: " + usuario + "\n\n" +
                "1. Listar videojuegos\n" +
                "2. Registrar videojuego\n" +
                "3. Actualizar videojuego\n" +
                "4. Eliminar videojuego\n" +
                "5. Cerrar sesión",
                "Menú Principal", JOptionPane.PLAIN_MESSAGE);

            if (input == null) {
                break;
            }

            try {
                opcion = Integer.parseInt(input.trim());

                switch (opcion) {
                    case 1 -> vistaListarVideojuegos();
                    case 2 -> vistaRegistrarVideojuego();
                    case 3 -> vistaActualizarVideojuego();
                    case 4 -> vistaEliminarVideojuego();
                    case 5 -> JOptionPane.showMessageDialog(null, "Sesión cerrada.");
                    default -> JOptionPane.showMessageDialog(null, "Opción no válida. Elige entre 1 y 5.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingresa un número válido.");
            }
        }
    }

    // ================= ESTRUCTURA BASE PARA EL CRUD =================

    private void vistaListarVideojuegos() {
        // TODO (READ):
        // 1. Llamar a controller.listar() para traer los registros de SQLite.
        // 2. Formatear la lista en un StringBuilder y mostrarla en JOptionPane.
        JOptionPane.showMessageDialog(null, "Pendiente: Módulo Listar (Read).");
    }

    private void vistaRegistrarVideojuego() {
        // TODO (CREATE):
        // 1. Pedir titulo, genero, plataforma y precio con JOptionPane.
        // 2. Validar tipos numéricos (Double.parseDouble para precio).
        // 3. Enviar el objeto Videojuego a controller.registrar(...).
        JOptionPane.showMessageDialog(null, "Pendiente: Módulo Registrar (Create).");
    }

    private void vistaActualizarVideojuego() {
        // TODO (UPDATE):
        // 1. Pedir el ID del videojuego a modificar.
        // 2. Pedir los nuevos valores (titulo, genero, plataforma, precio).
        // 3. Llamar a controller.actualizar(...).
        JOptionPane.showMessageDialog(null, "Pendiente: Módulo Actualizar (Update).");
    }

    private void vistaEliminarVideojuego() {
        // TODO (DELETE):
        // 1. Pedir el ID del videojuego a eliminar.
        // 2. Confirmar la acción con JOptionPane.showConfirmDialog().
        // 3. Llamar a controller.eliminar(id).
        JOptionPane.showMessageDialog(null, "Pendiente: Módulo Eliminar (Delete).");
    }
}