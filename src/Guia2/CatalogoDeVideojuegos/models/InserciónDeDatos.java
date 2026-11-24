package Guia2.CatalogoDeVideojuegos.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import ConexionDb.ConexionDB;

public class InserciónDeDatos {

    public static void insertarDatosInicialesUsuario() {
        String sql = "INSERT OR IGNORE INTO usuarios (username, password) VALUES (?, ?)";

        try (Connection conn = ConexionDB.getConexion();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // Usuario 1: admin / admin123
            pstmt.setString(1, "admin");
            pstmt.setString(2, "admin123");
            pstmt.addBatch();

            // Usuario 2: empleado / emp456
            pstmt.setString(1, "empleado");
            pstmt.setString(2, "emp456");
            pstmt.addBatch();

            pstmt.executeBatch();
            System.out.println("Datos iniciales de 'usuarios' verificados.");
        } catch (SQLException e) {
            System.err.println("Error al insertar datos iniciales en 'usuarios': " + e.getMessage());
        }
    }

    public static void insertarDatosInicialesVideojuegos() {
        String sqlCount = "SELECT COUNT(*) FROM videojuegos";
        String sqlInsert = "INSERT INTO videojuegos (titulo, genero, plataforma, precio) VALUES (?, ?, ?, ?)";

        try (Connection conn = ConexionDB.getConexion();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sqlCount)) {

            if (rs.next() && rs.getInt(1) > 0) {
                System.out.println("Datos iniciales de 'videojuegos' ya existen.");
                return;
            }

            try (PreparedStatement pstmt = conn.prepareStatement(sqlInsert)) {
                
                pstmt.setString(1, "The Witcher 3: Wild Hunt");
                pstmt.setString(2, "RPG");
                pstmt.setString(3, "PC");
                pstmt.setDouble(4, 29.99);
                pstmt.addBatch();

                pstmt.setString(1, "God of War Ragnarök");
                pstmt.setString(2, "Acción / Aventura");
                pstmt.setString(3, "PS5");
                pstmt.setDouble(4, 59.99);
                pstmt.addBatch();

                pstmt.setString(1, "The Legend of Zelda: Tears of the Kingdom");
                pstmt.setString(2, "Aventura");
                pstmt.setString(3, "Nintendo Switch");
                pstmt.setDouble(4, 69.99);
                pstmt.addBatch();

                pstmt.executeBatch();
                System.out.println("Datos iniciales de 'videojuegos' insertados.");
            }
        } catch (SQLException e) {
            System.err.println("Error al insertar datos iniciales en 'videojuegos': " + e.getMessage());
        }
    }
}