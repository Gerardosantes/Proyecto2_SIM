
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
        int folio;       //estos son los nombres que le di a las variables
        
        do{

            System.out.println("===== CAJERO AUTOMATICO =====");      //Distintos menus
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opcion: ");

            opcion = leer.nextInt();
            
            switch (opcion) {

                case 1:

                    System.out.println("Tu saldo es: $" + saldo);
                    break;

                case 2:

                    System.out.print("Cantidad a depositar: $");
                    deposito = leer.nextDouble();

                    saldo = saldo + deposito;

                    folio = random.nextInt(9000) + 1000;

                    System.out.println("Deposito realizado correctamente");
                    System.out.println("Folio: " + folio);
                    break;
                    
                case 3:

                    System.out.print("Cantidad a retirar: $");
                    retiro = leer.nextDouble();

                    if (retiro <= saldo) {

                        saldo = saldo - retiro;

                        folio = random.nextInt(9000) + 1000;

                        System.out.println("Retiro exitoso");
                        System.out.println("Folio: " + folio);

                    } else {

                        System.out.println("Saldo insuficiente");

                    }

                    break;
                    
         case 4:
                    System.out.println("Gracias por usar el cajero.");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 4);

        leer.close();
    }
}
        
