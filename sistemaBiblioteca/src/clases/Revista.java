package clases;

/**
 * Clase Revista:
 * Representa una revista en el sistema de biblioteca.
 * Hereda título y estado de préstamo de Item y añade el número de edición.
 */
public class Revista extends Item {
    private int numeroEdicion;

    public Revista(String titulo, int numeroEdicion) {
        super(titulo);
        this.numeroEdicion = numeroEdicion;
    }

    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    @Override
    public String toString() {
        return "Revista: " + getTitulo() + " | Edición: " + numeroEdicion + " | Estado: " + (isPrestado() ? "Prestado" : "Disponible");
    }
}