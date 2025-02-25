package clases;

public abstract class Personaje {
    protected String nombre;
    protected int salud;

    public Personaje(String nombre, int salud) {
        this.nombre = nombre;
        this.salud = salud;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSalud() {
        return salud;
    }

    public boolean estaVivo() {
        return salud > 0;
    }

    /**
    Método abstracto para atacar a otro personaje; Cada clase derivada debe definir su propia lógica de ataque.
     */
    public abstract void atacar(Personaje enemigo);

    /**
     Método abstracto para defenderse de un ataque; Cada clase derivada debe definir su propia lógica de defensa.
     */
    public abstract void defender();

    /**
    Método para recibir daño; Se puede sobrescribir en las subclases si tienen defensas especiales.
     */
    public void recibirDanio(int danio) {
        salud -= danio;
        if (salud < 0) {
            salud = 0;
        }
        System.out.println(nombre + " recibió " + danio + " puntos de daño. Salud restante: " + salud);
    }

    @Override
    public String toString() {
        return "Personaje: " + nombre + " | Salud: " + salud;
    }
}
