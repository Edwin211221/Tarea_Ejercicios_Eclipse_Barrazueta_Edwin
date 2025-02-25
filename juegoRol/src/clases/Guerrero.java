package clases;

public class Guerrero extends Personaje {
    private int fuerza;      // Atributo específico de Guerrero
    private boolean escudoLevantado; // Indica si está bloqueando

    public Guerrero(String nombre, int salud, int fuerza) {
        super(nombre, salud);
        this.fuerza = fuerza;
        this.escudoLevantado = false;
    }

    @Override
    public void atacar(Personaje enemigo) {
        System.out.println(nombre + " ataca con su espada a " + enemigo.getNombre());
        // Ejemplo: el daño depende de la fuerza
        int danio = fuerza * 2; 
        enemigo.recibirDanio(danio);
    }

    @Override
    public void defender() {
        // El Guerrero levanta el escudo para reducir el daño que reciba próximamente
        escudoLevantado = true;
        System.out.println(nombre + " levanta su escudo para defenderse.");
    }

    @Override
    public void recibirDanio(int danio) {
        if (escudoLevantado) {
            // Mitigamos parte del daño
            danio /= 2;
            escudoLevantado = false; // Después de un impacto, el escudo se baja
            System.out.println(nombre + " bloqueó parte del daño con el escudo.");
        }
        super.recibirDanio(danio);
    }

    @Override
    public String toString() {
        return "Guerrero: " + nombre + " | Salud: " + salud + " | Fuerza: " + fuerza;
    }
}
