package Guia2.CatalogoDeVideojuegos.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

import ConexionDb.ConexionDB;
import Guia2.CatalogoDeVideojuegos.models.Videojuego;

public class VideojuegoController {

    // ================= READ =================
    public List<Videojuego> listar() {
        List<Videojuego> lista = new ArrayList<>();
        String sql = "SELECT id, titulo, genero, plataforma, precio FROM videojuegos ORDER BY id";

        try (Connection conn = ConexionDB.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                lista.add(mapear(rs));
            }
        } catch (SQLException e) {
            mostrarError("listar los videojuegos", e);
        }
        return lista;
    }

    public Videojuego buscarPorId(int id) {
        String sql = "SELECT id, titulo, genero, plataforma, precio FROM videojuegos WHERE id = ?";

        try (Connection conn = ConexionDB.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return mapear(rs);
                }
            }
        } catch (SQLException e) {
            mostrarError("buscar el videojuego", e);
        }
        return null;
    }

    // ================= CREATE =================
    public boolean registrar(Videojuego v) {
        String sql = "INSERT INTO videojuegos (titulo, genero, plataforma, precio) VALUES (?, ?, ?, ?)";

        try (Connection conn = ConexionDB.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, v.getTitulo());
            ps.setString(2, v.getGenero());
            ps.setString(3, v.getPlataforma());
            ps.setDouble(4, v.getPrecio());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            mostrarError("registrar el videojuego", e);
            return false;
        }
    }

    // ================= UPDATE =================
    public boolean actualizar(Videojuego v) {
        String sql = "UPDATE videojuegos SET titulo = ?, genero = ?, plataforma = ?, precio = ? WHERE id = ?";

        try (Connection conn = ConexionDB.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, v.getTitulo());
            ps.setString(2, v.getGenero());
            ps.setString(3, v.getPlataforma());
            ps.setDouble(4, v.getPrecio());
            ps.setInt(5, v.getId());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            mostrarError("actualizar el videojuego", e);
            return false;
        }
    }

    // ================= DELETE =================
    public boolean eliminar(int id) {
        String sql = "DELETE FROM videojuegos WHERE id = ?";

        try (Connection conn = ConexionDB.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            mostrarError("eliminar el videojuego", e);
            return false;
        }
    }

    // ================= AUXILIARES =================
    private Videojuego mapear(ResultSet rs) throws SQLException {
        return new Videojuego(
                rs.getInt("id"),
                rs.getString("titulo"),
                rs.getString("genero"),
                rs.getString("plataforma"),
                rs.getDouble("precio"));
    }

    private void mostrarError(String accion, SQLException e) {
        JOptionPane.showMessageDialog(null,
                "Error al " + accion + ": " + e.getMessage(),
                "Error SQL", JOptionPane.ERROR_MESSAGE);
    }
}
