package clases;

/*
 * Clase derivada de Figura.
 * Similar estilo al rectángulo, pero con radio en lugar de base/altura.
 */
public class Circulo extends Figura {
    // Atributo privado para encapsular el radio
    private double radio;

    // Constructor por defecto
    public Circulo() {
        super();
        this.radio = 0.0;
    }

    // Método para establecer el radio con un double
    public void establecerDimensiones(double r) {
        this.radio = r;
    }

    // Sobrecarga: método para establecer el radio con un String
    // Por ejemplo: "7.5"
    public void establecerDimensiones(String r) {
        this.radio = Double.parseDouble(r);
    }

    // Sobrescritura del método calcularArea()
    @Override
    public double calcularArea() {
        // Fórmula: π * (radio^2)
        return Math.PI * radio * radio;
    }
}