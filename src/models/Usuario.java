package models;

public class Usuario {
    private int id;
    private String username;
    private String password;

    // Constructor vacío
    public Usuario() {
    }

    // Constructor sin ID (para registrar nuevos usuarios, SQLite genera el ID)
    public Usuario(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Constructor completo (para listar o actualizar registros existentes)
    public Usuario(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario [ID=" + id + ", Username=" + username + "]";
    }
}