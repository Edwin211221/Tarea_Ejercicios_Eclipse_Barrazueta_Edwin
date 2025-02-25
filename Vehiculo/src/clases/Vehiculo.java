package clases;

public abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int anyo;

    public Vehiculo(String marca, String modelo, int anyo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anyo = anyo;
    }

    public String getMarca() {
        return marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public int getAnyo() {
        return anyo;
    }
    
    // Métodos abstractos para el cálculo de consumo y velocidad máxima
    public abstract double calcularConsumo();    // Litros/100 km
    public abstract double getVelocidadMaxima();   // km/h

    @Override
    public String toString() {
        return "Marca: " + marca + " | Modelo: " + modelo + " | Año: " + anyo;
    }
}
