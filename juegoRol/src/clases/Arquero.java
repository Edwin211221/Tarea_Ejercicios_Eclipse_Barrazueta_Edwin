package clases;

import java.util.Random;

public class Arquero extends Personaje {
    private int precision;
    private boolean esquivando;

    public Arquero(String nombre, int salud, int precision) {
        super(nombre, salud);
        this.precision = precision;
        this.esquivando = false;
    }

    @Override
    public void atacar(Personaje enemigo) {
        System.out.println(nombre + " dispara una flecha a " + enemigo.getNombre());
        // Posibilidad de golpe crítico basado en la precisión
        int danio = 5; 
        Random rand = new Random();
        if (rand.nextInt(100) < precision) {
            danio *= 2; // Golpe crítico
            System.out.println("¡Golpe crítico!");
        }
        enemigo.recibirDanio(danio);
    }

    @Override
    public void defender() {
        // El Arquero trata de esquivar el próximo ataque
        esquivando = true;
        System.out.println(nombre + " se prepara para esquivar el próximo ataque.");
    }

    @Override
    public void recibirDanio(int danio) {
        if (esquivando) {
            // Posibilidad de esquivar completamente el daño
            Random rand = new Random();
            if (rand.nextInt(100) < (precision + 20)) { 
                danio = 0;
                System.out.println(nombre + " esquivó completamente el ataque.");
            } else {
                System.out.println(nombre + " no pudo esquivar el ataque a tiempo.");
            }
            esquivando = false;
        }
        super.recibirDanio(danio);
    }

    @Override
    public String toString() {
        return "Arquero: " + nombre + " | Salud: " + salud + " | Precisión: " + precision;
    }
}
