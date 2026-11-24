package Guia2.CatalogoDeVideojuegos.models;

import ConexionDb.ConexionDB;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UsuarioTabla {

    public static void crearTabla() {
        String sql = """
                CREATE TABLE IF NOT EXISTS usuarios (
                    id       INTEGER PRIMARY KEY AUTOINCREMENT,
                    username TEXT NOT NULL UNIQUE,
                    password TEXT NOT NULL
                );
                """;

        try (Connection conn = ConexionDB.getConexion();
                Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabla 'usuarios' verificada/creada correctamente.");
        } catch (SQLException e) {
            System.err.println("Error al crear la tabla 'usuarios': " + e.getMessage());
        }
    }
}