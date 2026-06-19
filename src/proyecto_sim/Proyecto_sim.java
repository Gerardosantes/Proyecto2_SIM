
package proyecto_sim;

import java.util.Scanner;
import java.util.Random;

public class Proyecto_sim {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Random random = new Random();

        int opcion;
        double saldo = 0;
        double deposito;
        double retiro;
        int folio;

        // Variables para simulación
        int totalDepositos = 0;
        int totalRetiros = 0;
        double montoDepositado = 0;
        double montoRetirado = 0;

        do {

            System.out.println("\n===== CAJERO AUTOMATICO =====");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Ver estadisticas");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opcion: ");

            opcion = leer.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Tu saldo actual es: $" + saldo);
                    break;

                case 2:
                    System.out.print("Cantidad a depositar: $");
                    deposito = leer.nextDouble();

                    saldo += deposito;

                    totalDepositos++;
                    montoDepositado += deposito;

                    folio = random.nextInt(9000) + 1000;

                    System.out.println("Deposito realizado correctamente");
                    System.out.println("Folio: " + folio);
                    break;

                case 3:
                    System.out.print("Cantidad a retirar: $");
                    retiro = leer.nextDouble();

                    if (retiro <= saldo) {

                        saldo -= retiro;

                        totalRetiros++;
                        montoRetirado += retiro;

                        folio = random.nextInt(9000) + 1000;

                        System.out.println("Retiro exitoso");
                        System.out.println("Folio: " + folio);

                    } else {
                        System.out.println("Saldo insuficiente");
                    }
                    break;

                case 4:
                    System.out.println("\n===== ESTADISTICAS =====");
                    System.out.println("Depositos realizados: " + totalDepositos);
                    System.out.println("Retiros realizados: " + totalRetiros);
                    System.out.println("Total depositado: $" + montoDepositado);
                    System.out.println("Total retirado: $" + montoRetirado);
                    System.out.println("Saldo final: $" + saldo);
                    break;

                case 5:
                    System.out.println("Gracias por usar el cajero.");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 5);

        leer.close();
    }
}