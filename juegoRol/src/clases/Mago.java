package clases;

public class Mago extends Personaje {
    private int poderMagico;
    private int mana;
    private boolean escudoMagicoActivo;

    public Mago(String nombre, int salud, int poderMagico, int mana) {
        super(nombre, salud);
        this.poderMagico = poderMagico;
        this.mana = mana;
        this.escudoMagicoActivo = false;
    }

    @Override
    public void atacar(Personaje enemigo) {
        // Supongamos que cada ataque consume 10 de mana
        int costoHechizo = 10;
        if (mana >= costoHechizo) {
            System.out.println(nombre + " lanza un hechizo contra " + enemigo.getNombre());
            int danio = poderMagico * 3;
            enemigo.recibirDanio(danio);
            mana -= costoHechizo;
        } else {
            System.out.println(nombre + " no tiene suficiente mana para atacar.");
        }
    }

    @Override
    public void defender() {
        // Activa un escudo mágico que reduce el daño a un tercio
        escudoMagicoActivo = true;
        System.out.println(nombre + " invoca un escudo mágico para defenderse.");
    }

    @Override
    public void recibirDanio(int danio) {
        if (escudoMagicoActivo) {
            danio /= 3;
            escudoMagicoActivo = false; // Se desactiva tras recibir un golpe
            System.out.println(nombre + " redujo el daño con su escudo mágico.");
        }
        super.recibirDanio(danio);
    }

    @Override
    public String toString() {
        return "Mago: " + nombre + " | Salud: " + salud + " | Poder Mágico: " + poderMagico + " | Mana: " + mana;
    }
}