package Guia2.CatalogoDeVideojuegos.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ConexionDb.ConexionDB;

public class InserciónDeDatos {
    public static void insertarDatosInicialesUsuario() {
        String sql = "INSERT OR IGNORE INTO usuarios (username, password) VALUES (?, ?)";

        try (Connection conn = ConexionDB.getConexion();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, "admin");
            pstmt.setString(2, "1234");
            pstmt.executeUpdate();
            System.out.println("Datos iniciales de 'usuarios' verificados.");
        } catch (SQLException e) {
            System.err.println("Error al insertar datos iniciales en 'usuarios': " + e.getMessage());
        }
    }

    public static void insertarDatosInicialesVideojuegos() {
        String sql = "INSERT INTO videojuegos (titulo, genero, plataforma, precio) VALUES (?, ?, ?, ?)";

        try (Connection conn = ConexionDB.getConexion();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, "The Witcher 3: Wild Hunt");
            pstmt.setString(2, "RPG");
            pstmt.setString(3, "PC");
            pstmt.setDouble(4, 29.99);
            pstmt.executeUpdate();
            System.out.println("Datos iniciales de 'videojuegos' insertados.");
        } catch (SQLException e) {
            System.err.println("Error al insertar datos iniciales en 'videojuegos': " + e.getMessage());
        }
    }
}
