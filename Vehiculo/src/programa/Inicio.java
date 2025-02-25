package programa;

//Importamos todas las clases
import clases.Coche;
import clases.Motocicleta;
import clases.Camion;

public class Inicio {
    public static void main(String[] args) {
        // Creación de instancias de cada vehículo
        Coche coche = new Coche("Toyota", "Corolla", 2020, 1.8, 4);
        Motocicleta moto = new Motocicleta("Yamaha", "MT-07", 2021, 689);
        Camion camion = new Camion("Volvo", "FH", 2018, 10);

        // Mostrar la información de cada vehículo
        System.out.println(coche);
        System.out.println(moto);
        System.out.println(camion);
    }
}