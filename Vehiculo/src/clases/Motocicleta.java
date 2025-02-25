package clases;

public class Motocicleta extends Vehiculo {
    private double cilindrada; // en cc

    public Motocicleta(String marca, String modelo, int anyo, double cilindrada) {
        super(marca, modelo, anyo);
        this.cilindrada = cilindrada;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    @Override
    public double calcularConsumo() {
        // Fórmula de ejemplo: consumo = 3 + ((cilindrada / 1000) * 2)
        return 3 + (cilindrada / 1000) * 2;
    }

    @Override
    public double getVelocidadMaxima() {
        // Fórmula de ejemplo: velocidad máxima = 120 + (cilindrada / 10)
        return 120 + (cilindrada / 10);
    }

    @Override
    public String toString() {
        return "Motocicleta -> " + super.toString() +
               " | Cilindrada: " + cilindrada + " cc" +
               " | Consumo: " + calcularConsumo() + " L/100km" +
               " | Velocidad máxima: " + getVelocidadMaxima() + " km/h";
    }
}

