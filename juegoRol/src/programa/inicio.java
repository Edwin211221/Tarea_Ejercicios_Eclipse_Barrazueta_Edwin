package programa;
//Importamos las clases
import clases.Arquero;
import clases.Guerrero;
import clases.Mago;

public class inicio {
    public static void main(String[] args) {
        // Crear instancias de cada tipo de personaje
        Guerrero guerrero = new Guerrero("Sansón", 100, 10);
        Mago mago = new Mago("Jhon Constantine", 80, 15, 50);
        Arquero arquero = new Arquero("Green Arrow", 90, 30);

        // Mostrar información inicial
        System.out.println(guerrero);
        System.out.println(mago);
        System.out.println(arquero);
        System.out.println("----------------------------");

        // El Guerrero ataca al Mago
        guerrero.atacar(mago);
        // El Mago se defiende
        mago.defender();
        // El Arquero ataca al Guerrero
        arquero.atacar(guerrero);
        // El Guerrero defiende
        guerrero.defender();
        System.out.println("----------------------------");

        // El Mago ataca al Arquero
        mago.atacar(arquero);
        // El Arquero se defiende (intenta esquivar)
        arquero.defender();
        // El Guerrero ataca al Arquero
        guerrero.atacar(arquero);
        System.out.println("----------------------------");

        // Estado final
        System.out.println(guerrero);
        System.out.println(mago);
        System.out.println(arquero);
    }
}