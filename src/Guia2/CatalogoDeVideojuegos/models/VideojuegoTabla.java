package Guia2.CatalogoDeVideojuegos.models;

import ConexionDb.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class VideojuegoTabla {

    public static void crearTabla() {
        String sql = """
            CREATE TABLE IF NOT EXISTS videojuegos (
                id         INTEGER PRIMARY KEY AUTOINCREMENT,
                titulo     TEXT NOT NULL,
                genero     TEXT NOT NULL,
                plataforma TEXT NOT NULL,
                precio     REAL NOT NULL
            );
            """;

        try (Connection conn = ConexionDB.getConexion();
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabla 'videojuegos' verificada/creada correctamente.");
        } catch (SQLException e) {
            System.err.println("Error al crear la tabla 'videojuegos': " + e.getMessage());
        }
    }

    public static void insertarDatosIniciales() {
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
