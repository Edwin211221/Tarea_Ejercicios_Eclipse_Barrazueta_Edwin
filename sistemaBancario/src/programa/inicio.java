package programa;

import clases.cuentaBancaria;
import clases.cuentaAhorro;
import clases.cuentaCorriente;
import java.util.Scanner;

public class inicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        cuentaBancaria cuenta = null;
        int opcion;
        
        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Crear Cuenta Bancaria");
            System.out.println("2. Crear Cuenta de Ahorro");
            System.out.println("3. Crear Cuenta Corriente");
            System.out.println("4. Depositar");
            System.out.println("5. Retirar");
            System.out.println("6. Aplicar Interés (Solo Ahorro)");
            System.out.println("7. Pagar Sobregiro (Solo Corriente)");
            System.out.println("8. Mostrar Información");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir nueva línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese número de cuenta: ");
                    String numCuenta = scanner.nextLine();
                    System.out.print("Ingrese nombre del titular: ");
                    String titular = scanner.nextLine();
                    System.out.print("Ingrese saldo inicial: ");
                    double saldo = scanner.nextDouble();
                    cuenta = new cuentaBancaria(numCuenta, titular, saldo);
                    System.out.println("Cuenta Bancaria creada exitosamente.");
                    break;

                case 2:
                    System.out.print("Ingrese número de cuenta: ");
                    numCuenta = scanner.nextLine();
                    System.out.print("Ingrese nombre del titular: ");
                    titular = scanner.nextLine();
                    System.out.print("Ingrese saldo inicial: ");
                    saldo = scanner.nextDouble();
                    System.out.print("Ingrese tasa de interés (Ej: 0.05 para 5%): ");
                    double tasa = scanner.nextDouble();
                    System.out.print("Ingrese cantidad de retiros gratis por mes: ");
                    int retirosGratis = scanner.nextInt();
                    cuenta = new cuentaAhorro(numCuenta, titular, saldo, tasa, retirosGratis);
                    System.out.println("Cuenta de Ahorro creada exitosamente.");
                    break;

                case 3:
                    System.out.print("Ingrese número de cuenta: ");
                    numCuenta = scanner.nextLine();
                    System.out.print("Ingrese nombre del titular: ");
                    titular = scanner.nextLine();
                    System.out.print("Ingrese saldo inicial: ");
                    saldo = scanner.nextDouble();
                    System.out.print("Ingrese límite de sobregiro: ");
                    double limiteSobregiro = scanner.nextDouble();
                    cuenta = new cuentaCorriente(numCuenta, titular, saldo, limiteSobregiro);
                    System.out.println("Cuenta Corriente creada exitosamente.");
                    break;

                case 4:
                    if (cuenta != null) {
                        System.out.print("Ingrese monto a depositar: ");
                        double monto = scanner.nextDouble();
                        System.out.println(cuenta.depositar(monto));
                    } else {
                        System.out.println("Primero cree una cuenta.");
                    }
                    break;

                case 5:
                    if (cuenta != null) {
                        System.out.print("Ingrese monto a retirar: ");
                        double monto = scanner.nextDouble();
                        System.out.println(cuenta.retirar(monto));
                    } else {
                        System.out.println("Primero cree una cuenta.");
                    }
                    break;

                case 6:
                    if (cuenta instanceof cuentaAhorro) {
                        System.out.println(((cuentaAhorro) cuenta).aplicarInteres());
                    } else {
                        System.out.println("Esta opción solo aplica a cuentas de ahorro.");
                    }
                    break;

                case 7:
                    if (cuenta instanceof cuentaCorriente) {
                        System.out.print("Ingrese monto a pagar del sobregiro: ");
                        double pago = scanner.nextDouble();
                        System.out.println(((cuentaCorriente) cuenta).pagarSobregiro(pago));
                    } else {
                        System.out.println("Esta opción solo aplica a cuentas corrientes.");
                    }
                    break;

                case 8:
                    if (cuenta != null) {
                        System.out.println("\nInformación de la cuenta:");
                        System.out.println(cuenta.getInformacion());
                    } else {
                        System.out.println("Primero cree una cuenta.");
                    }
                    break;

                case 9:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 9);

        scanner.close();
    }
}