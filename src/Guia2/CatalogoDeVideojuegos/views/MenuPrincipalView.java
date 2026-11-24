package Guia2.CatalogoDeVideojuegos.views;

import java.util.List;
import javax.swing.JOptionPane;

import Guia2.CatalogoDeVideojuegos.controller.VideojuegoController;
import Guia2.CatalogoDeVideojuegos.models.Videojuego;

public class MenuPrincipalView {

    private final VideojuegoController controller = new VideojuegoController();

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

    // ================= CRUD =================

    private void vistaListarVideojuegos() {
        List<Videojuego> lista = controller.listar();

        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay videojuegos registrados.",
                    "Listado", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        StringBuilder sb = new StringBuilder("Videojuegos registrados (" + lista.size() + "):\n\n");
        for (Videojuego v : lista) {
            sb.append(v).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString(), "Listado", JOptionPane.INFORMATION_MESSAGE);
    }

    private void vistaRegistrarVideojuego() {
        String titulo = pedirTexto("Título del videojuego:", "Registrar", null);
        if (titulo == null) return;
        String genero = pedirTexto("Género:", "Registrar", null);
        if (genero == null) return;
        String plataforma = pedirTexto("Plataforma:", "Registrar", null);
        if (plataforma == null) return;
        Double precio = pedirPrecio("Registrar", null);
        if (precio == null) return;

        if (controller.registrar(new Videojuego(titulo, genero, plataforma, precio))) {
            JOptionPane.showMessageDialog(null, "Videojuego \"" + titulo + "\" registrado correctamente.");
        }
    }

    private void vistaActualizarVideojuego() {
        Videojuego actual = pedirVideojuegoExistente("Actualizar");
        if (actual == null) return;

        String titulo = pedirTexto("Título:", "Actualizar", actual.getTitulo());
        if (titulo == null) return;
        String genero = pedirTexto("Género:", "Actualizar", actual.getGenero());
        if (genero == null) return;
        String plataforma = pedirTexto("Plataforma:", "Actualizar", actual.getPlataforma());
        if (plataforma == null) return;
        Double precio = pedirPrecio("Actualizar", actual.getPrecio());
        if (precio == null) return;

        Videojuego modificado = new Videojuego(actual.getId(), titulo, genero, plataforma, precio);
        if (controller.actualizar(modificado)) {
            JOptionPane.showMessageDialog(null, "Videojuego actualizado:\n" + modificado);
        }
    }

    private void vistaEliminarVideojuego() {
        Videojuego v = pedirVideojuegoExistente("Eliminar");
        if (v == null) return;

        int confirm = JOptionPane.showConfirmDialog(null,
                "¿Seguro que deseas eliminar este videojuego?\n\n" + v,
                "Confirmar eliminación", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

        if (confirm == JOptionPane.YES_OPTION && controller.eliminar(v.getId())) {
            JOptionPane.showMessageDialog(null, "Videojuego eliminado correctamente.");
        }
    }

    // ================= AUXILIARES DE ENTRADA =================

    /** Pide un ID y devuelve el videojuego si existe; null si se cancela o no existe. */
    private Videojuego pedirVideojuegoExistente(String titulo) {
        while (true) {
            String input = JOptionPane.showInputDialog(null, "ID del videojuego:", titulo,
                    JOptionPane.QUESTION_MESSAGE);
            if (input == null) return null;

            try {
                int id = Integer.parseInt(input.trim());
                Videojuego v = controller.buscarPorId(id);
                if (v == null) {
                    JOptionPane.showMessageDialog(null, "No existe un videojuego con ID " + id + ".");
                    return null;
                }
                return v;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El ID debe ser un número entero.");
            }
        }
    }

    /** Pide un texto obligatorio; valorInicial rellena el campo (para editar). null si se cancela. */
    private String pedirTexto(String mensaje, String titulo, String valorInicial) {
        while (true) {
            Object input = JOptionPane.showInputDialog(null, mensaje, titulo,
                    JOptionPane.QUESTION_MESSAGE, null, null, valorInicial);
            if (input == null) return null;

            String texto = input.toString().trim();
            if (!texto.isEmpty()) return texto;
            JOptionPane.showMessageDialog(null, "Este campo no puede estar vacío.");
        }
    }

    /** Pide un precio válido (>= 0). null si se cancela. */
    private Double pedirPrecio(String titulo, Double valorInicial) {
        while (true) {
            String texto = pedirTexto("Precio:", titulo,
                    valorInicial == null ? null : String.valueOf(valorInicial));
            if (texto == null) return null;

            try {
                double precio = Double.parseDouble(texto.replace(',', '.'));
                if (precio >= 0) return precio;
                JOptionPane.showMessageDialog(null, "El precio no puede ser negativo.");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingresa un precio válido (ej. 49.99).");
            }
        }
    }
}
