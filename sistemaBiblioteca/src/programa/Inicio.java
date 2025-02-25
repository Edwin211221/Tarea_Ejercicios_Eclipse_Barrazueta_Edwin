package programa;

import clases.Libro;
import clases.Revista;
import clases.DVD;

/**
 * Clase principal para probar el sistema de biblioteca.
 * Se crean instancias de Libro, Revista y DVD, y se demuestran
 * los métodos de préstamo y devolución.
 */
public class Inicio {
    public static void main(String[] args) {
        // Creación de objetos con datos separados y claros.
        Libro libro = new Libro("El Amor en los tiempos del cólera", "Gabriel García Márquez");
        Revista revista = new Revista("Vistazo", 2024);
        DVD dvd = new DVD("Batman: El caballero de la noche", 148);
 
        // Mostrar información inicial de cada ítem.
        System.out.println(libro);
        System.out.println(revista);
        System.out.println(dvd);

        // Prueba de los métodos prestar().
        libro.prestar();
        revista.prestar();
        dvd.prestar();

        // Intento de prestar el libro nuevamente.
        libro.prestar();

        // Prueba de los métodos devolver().
        libro.devolver();
        revista.devolver();
        dvd.devolver();

        // Intento de devolver el DVD nuevamente.
        dvd.devolver();
    }
}
