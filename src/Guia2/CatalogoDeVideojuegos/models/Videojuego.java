package Guia2.CatalogoDeVideojuegos.models;

public class Videojuego {
    private int id;
    private String titulo;
    private String genero;
    private String plataforma;
    private double precio;

    // Constructor vacío
    public Videojuego() {
    }

    // Constructor sin ID (para insertar nuevos juegos en la BD)
    public Videojuego(String titulo, String genero, String plataforma, double precio) {
        this.titulo = titulo;
        this.genero = genero;
        this.plataforma = plataforma;
        this.precio = precio;
    }

    // Constructor completo (para listar o actualizar registros existentes)
    public Videojuego(int id, String titulo, String genero, String plataforma, double precio) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.plataforma = plataforma;
        this.precio = precio;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Título: %s | Género: %s | Plataforma: %s | Precio: $%.2f",
                id, titulo, genero, plataforma, precio);
    }
}