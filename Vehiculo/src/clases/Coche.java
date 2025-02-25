package clases;

public class Coche extends Vehiculo {
    private double motor; // en litros
    private int numPuertas;

    public Coche(String marca, String modelo, int anyo, double motor, int numPuertas) {
        super(marca, modelo, anyo);
        this.motor = motor;
        this.numPuertas = numPuertas;
    }

    public double getMotor() {
        return motor;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    @Override
    public double calcularConsumo() {
        // Fórmula de ejemplo: consumo = 5 + (motor * 3)
        return 5 + motor * 3;
    }

    @Override
    public double getVelocidadMaxima() {
        // Fórmula de ejemplo: velocidad máxima = 180 + (motor * 20)
        return 180 + motor * 20;
    }

    @Override
    public String toString() {
        return "Coche -> " + super.toString() +
               " | Motor: " + motor + "L" +
               " | Puertas: " + numPuertas +
               " | Consumo: " + calcularConsumo() + " L/100km" +
               " | Velocidad máxima: " + getVelocidadMaxima() + " km/h";
    }
}