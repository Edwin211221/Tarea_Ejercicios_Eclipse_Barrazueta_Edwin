package clases;

/**
 * Clase base Item:
 * Representa un ítem genérico en el sistema de biblioteca.
 * Contiene atributos comunes (título y estado de préstamo) y
 * métodos para prestar y devolver el ítem.
 */
public abstract class Item {
    private String titulo;
    private boolean prestado;

    public Item(String titulo) {
        this.titulo = titulo;
        this.prestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isPrestado() {
        return prestado;
    }

    /**
     * Presta el ítem si está disponible.
     * @return true si se presta, false si ya estaba prestado.
     */
    public boolean prestar() {
        if (!prestado) {
            prestado = true;
            System.out.println(titulo + " ha sido prestado.");
            return true;
        } else {
            System.out.println(titulo + " ya se encuentra prestado.");
            return false;
        }
    }

    /**
     * Devuelve el ítem si estaba prestado.
     * @return true si se devuelve, false si no estaba prestado.
     */
    public boolean devolver() {
        if (prestado) {
            prestado = false;
            System.out.println(titulo + " ha sido devuelto.");
            return true;
        } else {
            System.out.println(titulo + " no estaba prestado.");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Título: " + titulo + " | Estado: " + (prestado ? "Prestado" : "Disponible");
    }
}