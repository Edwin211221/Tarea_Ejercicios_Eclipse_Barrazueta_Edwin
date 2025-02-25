package clases;

/*
 * Clase derivada de Figura.
 * Permite establecer la base y altura de varias maneras (sobrecargas).
 */
public class Rectangulo extends Figura {
    // Atributos privados para encapsulación
    private double base;
    private double altura;

    // Constructor por defecto
    public Rectangulo() {
        super();          // Llamamos al constructor de Figura (abstracto)
        this.altura = 0.0;
        this.base = 0.0;
    }

    // Método para establecer dimensiones con base y altura
    public void establecerDimensiones(double b, double a) {
        this.base = b;
        this.altura = a;
    }

    // Sobrecarga del método para un cuadrado (base y altura iguales)
    public void establecerDimensiones(double lado) {
        this.base = lado;
        this.altura = lado;
    }

    // Segunda sobrecarga del método, recibe un string con "base,altura"
    public void establecerDimensiones(String dimensiones) {
        String[] valores = dimensiones.split(",");
        if (valores.length == 2) {
            this.base = Double.parseDouble(valores[0]);
            this.altura = Double.parseDouble(valores[1]); 
        }
    }

    // Sobrescritura del método calcularArea() proveniente de Figura
    @Override
    public double calcularArea() {
        return base * altura;
    }
}