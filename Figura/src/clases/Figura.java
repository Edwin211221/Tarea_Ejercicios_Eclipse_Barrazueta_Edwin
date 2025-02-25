package clases;

/*Clase base (abstracta) que obliga a las clases derivadas a implementar el método calcularArea(). */
public abstract class Figura {
    // Método abstracto que cada subclase (Rectangulo, Circulo) implementará
    public abstract double calcularArea();
}