package programa;

import java.util.Scanner;
import clases.Rectangulo;
import clases.Circulo;

public class inicio {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // --- Rectángulo ---
        System.out.println("Ingrese la base del rectángulo:");
        double base = leer.nextDouble();  // Leemos la base
        System.out.println("Ingrese la altura del rectángulo:");
        double altura = leer.nextDouble();  // Leemos la altura

        Rectangulo r = new Rectangulo();
        r.establecerDimensiones(base, altura);
        System.out.println("Área del rectángulo: " + r.calcularArea());

        // --- Círculo ---
        System.out.println("Ingrese el radio del círculo:");
        double radio = leer.nextDouble();  // Leemos el radio

        Circulo c = new Circulo();
        c.establecerDimensiones(radio); // Sobrecarga con double
        System.out.println("Área del círculo: " + c.calcularArea());
        //Cerramos el método "Leer"
        leer.close();
    }
}