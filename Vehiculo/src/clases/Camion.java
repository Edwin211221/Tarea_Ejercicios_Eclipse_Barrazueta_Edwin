package clases;

public class Camion extends Vehiculo {
    private double cargaMaxima; // en toneladas

    public Camion(String marca, String modelo, int anyo, double cargaMaxima) {
        super(marca, modelo, anyo);
        this.cargaMaxima = cargaMaxima;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    @Override
    public double calcularConsumo() {
        // Fórmula de ejemplo: consumo = 20 + (cargaMaxima * 5)
        return 20 + cargaMaxima * 5;
    }

    @Override
    public double getVelocidadMaxima() {
        // Fórmula de ejemplo: velocidad máxima = 100 - (cargaMaxima * 2), con mínimo 60 km/h
        double velocidad = 100 - cargaMaxima * 2;
        return velocidad < 60 ? 60 : velocidad;
    }

    @Override
    public String toString() {
        return "Camion -> " + super.toString() +
               " | Carga máxima: " + cargaMaxima + " toneladas" +
               " | Consumo: " + calcularConsumo() + " L/100km" +
               " | Velocidad máxima: " + getVelocidadMaxima() + " km/h";
    }
}