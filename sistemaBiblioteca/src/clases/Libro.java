package clases;

/**
 * Clase Libro:
 * Representa un libro en el sistema de biblioteca.
 * Hereda título y estado de préstamo de Item y añade el autor.
 */
public class Libro extends Item {
    private String autor;

    public Libro(String titulo, String autor) {
        super(titulo);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Libro: " + getTitulo() + " | Autor: " + autor + " | Estado: " + (isPrestado() ? "Prestado" : "Disponible");
    }
}