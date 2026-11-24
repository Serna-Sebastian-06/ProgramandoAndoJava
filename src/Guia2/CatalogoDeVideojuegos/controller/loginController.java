package Guia2.CatalogoDeVideojuegos.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import ConexionDb.ConexionDB;

public class loginController {

    public boolean login(String username, String password) {
        String sql = "SELECT * FROM usuarios WHERE username = ? AND password = ?";

        try (Connection conn = ConexionDB.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, username);
            ps.setString(2, password);

            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                "Error al consultar la base de datos: " + e.getMessage(),
                "Error SQL", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}