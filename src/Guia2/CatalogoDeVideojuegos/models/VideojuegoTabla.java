package Guia2.CatalogoDeVideojuegos.models;

import ConexionDb.ConexionDB;
import java.sql.Connection;
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
}
