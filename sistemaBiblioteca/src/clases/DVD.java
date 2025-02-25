package clases;

/**
 * Clase DVD:
 * Representa un DVD en el sistema de biblioteca.
 * Hereda título y estado de préstamo de Item y añade la duración.
 */
public class DVD extends Item {
    private int duracion;

    public DVD(String titulo, int duracion) {
        super(titulo);
        this.duracion = duracion;
    }

    public int getDuracion() {
        return duracion;
    }

    @Override
    public String toString() {
        return "DVD: " + getTitulo() + " | Duración: " + duracion + " minutos" + " | Estado: " + (isPrestado() ? "Prestado" : "Disponible");
    }
}