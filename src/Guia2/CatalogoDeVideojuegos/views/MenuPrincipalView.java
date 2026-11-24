package Guia2.CatalogoDeVideojuegos.views;

import Guia2.CatalogoDeVideojuegos.dao.VideojuegoDAO;
import Guia2.CatalogoDeVideojuegos.models.Usuario;
import Guia2.CatalogoDeVideojuegos.models.Videojuego;

import javax.swing.JOptionPane;
import java.util.List;

public class MenuPrincipalView {

    private final VideojuegoDAO videojuegoDAO;

    public MenuPrincipalView(VideojuegoDAO videojuegoDAO) {
        this.videojuegoDAO = videojuegoDAO;
    }

    public boolean mostrar(Usuario usuarioActual) {
        boolean enMenu = true;

        while (enMenu) {
            String nombreUsuario = (usuarioActual != null) ? usuarioActual.getUsername() : "Invitado";
            String opcion = JOptionPane.showInputDialog(
                    null,
                    """
                    Usuario activo: %s

                    1. Agregar videojuego
                    2. Ver todos los videojuegos
                    3. Actualizar videojuego
                    4. Eliminar videojuego
                    5. Cerrar sesión
                    0. Salir
                    """.formatted(nombreUsuario),
                    "Menú Principal - Catálogo de Videojuegos",
                    JOptionPane.PLAIN_MESSAGE
            );

            if (opcion == null) {
                usuarioActual = null;
                return true;
            }

            switch (opcion.trim()) {
                case "1" -> agregar();
                case "2" -> verTodos();
                case "3" -> actualizar();
                case "4" -> eliminar();
                case "5" -> {
                    usuarioActual = null;
                    JOptionPane.showMessageDialog(null, "Sesión cerrada. Volviendo al Login...");
                    return true;
                }
                case "0" -> {
                    usuarioActual = null;
                    enMenu = false;
                }
                default -> JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        }

        return false;
    }

    private void agregar() {
        try {
            String titulo = JOptionPane.showInputDialog("Título del videojuego:");
            if (titulo == null || titulo.isBlank()) return;

            String genero = JOptionPane.showInputDialog("Género:");
            if (genero == null || genero.isBlank()) return;

            String plataforma = JOptionPane.showInputDialog("Plataforma:");
            if (plataforma == null || plataforma.isBlank()) return;

            String precioStr = JOptionPane.showInputDialog("Precio:");
            if (precioStr == null) return;
            double precio = Double.parseDouble(precioStr.trim().replace(",", "."));

            if (precio < 0) {
                JOptionPane.showMessageDialog(null, "El precio no puede ser negativo.");
                return;
            }

            boolean ok = videojuegoDAO.agregar(new Videojuego(titulo.trim(), genero.trim(), plataforma.trim(), precio));
            JOptionPane.showMessageDialog(null, ok ? "Videojuego registrado." : "No se pudo registrar.");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingresa un precio numérico válido.");
        }
    }

    private void verTodos() {
        List<Videojuego> lista = videojuegoDAO.listarTodos();
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay videojuegos registrados.");
            return;
        }

        StringBuilder sb = new StringBuilder("=== VIDEOJUEGOS ===\n");
        for (Videojuego v : lista) {
            sb.append(v.toString()).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    private void actualizar() {
        try {
            String idStr = JOptionPane.showInputDialog("ID del videojuego a actualizar:");
            if (idStr == null) return;
            int id = Integer.parseInt(idStr.trim());
            if (id <= 0) {
                JOptionPane.showMessageDialog(null, "El ID debe ser mayor que 0.");
                return;
            }

            String titulo = JOptionPane.showInputDialog("Nuevo título:");
            if (titulo == null || titulo.isBlank()) return;

            String genero = JOptionPane.showInputDialog("Nuevo género:");
            if (genero == null || genero.isBlank()) return;

            String plataforma = JOptionPane.showInputDialog("Nueva plataforma:");
            if (plataforma == null || plataforma.isBlank()) return;

            String precioStr = JOptionPane.showInputDialog("Nuevo precio:");
            if (precioStr == null) return;
            double precio = Double.parseDouble(precioStr.trim().replace(",", "."));

            if (precio < 0) {
                JOptionPane.showMessageDialog(null, "El precio no puede ser negativo.");
                return;
            }

            boolean ok = videojuegoDAO.actualizar(new Videojuego(id, titulo.trim(), genero.trim(), plataforma.trim(), precio));
            JOptionPane.showMessageDialog(null, ok ? "Videojuego actualizado." : "No se encontró el ID indicado.");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ID o precio inválido.");
        }
    }

    private void eliminar() {
        try {
            String idStr = JOptionPane.showInputDialog("ID del videojuego a eliminar:");
            if (idStr == null) return;
            int id = Integer.parseInt(idStr.trim());
            if (id <= 0) {
                JOptionPane.showMessageDialog(null, "El ID debe ser mayor que 0.");
                return;
            }

            int confirmacion = JOptionPane.showConfirmDialog(
                    null,
                    "¿Seguro que deseas eliminar el videojuego con ID " + id + "?",
                    "Confirmar eliminación",
                    JOptionPane.YES_NO_OPTION
            );

            if (confirmacion == JOptionPane.YES_OPTION) {
                boolean ok = videojuegoDAO.eliminar(id);
                JOptionPane.showMessageDialog(null, ok ? "Videojuego eliminado." : "No se encontró el ID indicado.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingresa un ID entero válido.");
        }
    }
}