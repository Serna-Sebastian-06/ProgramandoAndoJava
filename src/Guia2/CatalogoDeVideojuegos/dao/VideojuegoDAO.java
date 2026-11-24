package Guia2.CatalogoDeVideojuegos.dao;

import ConexionDb.ConexionDB;
import Guia2.CatalogoDeVideojuegos.models.Videojuego;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class VideojuegoDAO {

    public void crearTablaYDatosIniciales() {
        String sqlTabla = """
                CREATE TABLE IF NOT EXISTS videojuegos (
                    id INTEGER PRIMARY KEY AUTOINCREMENT,
                    titulo TEXT NOT NULL,
                    genero TEXT NOT NULL,
                    plataforma TEXT NOT NULL,
                    precio REAL NOT NULL
                );
                """;

        try (Connection conn = ConexionDB.getConexion()) {
            if (conn == null) {
                System.err.println("No se pudo obtener conexión a la base de datos.");
                return;
            }

            try (Statement stmt = conn.createStatement()) {
                stmt.execute(sqlTabla);
                insertarDatosIniciales(conn);
            }
        } catch (SQLException e) {
            System.err.println("Error al inicializar tabla videojuegos: " + e.getMessage());
        }
    }

    private void insertarDatosIniciales(Connection conn) throws SQLException {
        String contarSql = "SELECT COUNT(*) AS total FROM videojuegos";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(contarSql)) {
            if (rs.next() && rs.getInt("total") == 0) {
                agregarConConexion(conn, new Videojuego("Hades", "Roguelike", "PC / Switch", 24.99));
                agregarConConexion(conn, new Videojuego("Hollow Knight", "Metroidvania", "PC / PS5", 14.99));
                agregarConConexion(conn, new Videojuego("The Witcher 3", "RPG", "PC / PS5", 39.99));
            }
        }
    }

    private boolean agregarConConexion(Connection conn, Videojuego juego) throws SQLException {
        String sql = "INSERT INTO videojuegos (titulo, genero, plataforma, precio) VALUES (?, ?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, juego.getTitulo());
            ps.setString(2, juego.getGenero());
            ps.setString(3, juego.getPlataforma());
            ps.setDouble(4, juego.getPrecio());
            return ps.executeUpdate() > 0;
        }
    }

    // CREATE
    public boolean agregar(Videojuego juego) {
        try (Connection conn = ConexionDB.getConexion()) {
            if (conn == null) return false;
            return agregarConConexion(conn, juego);
        } catch (SQLException e) {
            System.err.println("Error al agregar videojuego: " + e.getMessage());
            return false;
        }
    }

    // READ
    public List<Videojuego> listarTodos() {
        List<Videojuego> lista = new ArrayList<>();
        String sql = "SELECT id, titulo, genero, plataforma, precio FROM videojuegos ORDER BY id ASC";

        try (Connection conn = ConexionDB.getConexion()) {
            if (conn == null) return lista;

            try (Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery(sql)) {

                while (rs.next()) {
                    lista.add(new Videojuego(
                            rs.getInt("id"),
                            rs.getString("titulo"),
                            rs.getString("genero"),
                            rs.getString("plataforma"),
                            rs.getDouble("precio")
                    ));
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al listar videojuegos: " + e.getMessage());
        }
        return lista;
    }

    // UPDATE
    public boolean actualizar(Videojuego juego) {
        String sql = "UPDATE videojuegos SET titulo = ?, genero = ?, plataforma = ?, precio = ? WHERE id = ?";
        try (Connection conn = ConexionDB.getConexion()) {
            if (conn == null) return false;

            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, juego.getTitulo());
                ps.setString(2, juego.getGenero());
                ps.setString(3, juego.getPlataforma());
                ps.setDouble(4, juego.getPrecio());
                ps.setInt(5, juego.getId());
                return ps.executeUpdate() > 0;
            }
        } catch (SQLException e) {
            System.err.println("Error al actualizar videojuego: " + e.getMessage());
            return false;
        }
    }

    // DELETE
    public boolean eliminar(int id) {
        String sql = "DELETE FROM videojuegos WHERE id = ?";
        try (Connection conn = ConexionDB.getConexion()) {
            if (conn == null) return false;

            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setInt(1, id);
                return ps.executeUpdate() > 0;
            }
        } catch (SQLException e) {
            System.err.println("Error al eliminar videojuego: " + e.getMessage());
            return false;
        }
    }
}