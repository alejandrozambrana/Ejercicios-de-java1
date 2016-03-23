
package Ejercicio2;

import java.util.Scanner;

public class Probar {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int km;
        int opcion;
    
        Bicicleta Motoretta = new Bicicleta("Rojo");
        coche fiestaST = new coche(1900);
      do{   
        System.out.println("1. Anda con la bicicleta");
        System.out.println("2. Haz el caballito con la bicicleta");
        System.out.println("3. Anda con el coche");
        System.out.println("4. Quema rueda con el coche");
        System.out.println("5. Ver kilometraje de la bicicleta");
        System.out.println("6. Ver kilometraje del coche");
        System.out.println("7. Ver kilometraje total");
        System.out.println("8. Salir");
        System.out.println("Elige una opciÃ³n (1-8): ");
         
        opcion = s.nextInt();
    
        switch (opcion) {
            case 1:
              System.out.print("¿Cuantos kilometros quieres recorrer? ");
              km = s.nextInt();
              Motoretta.recorre(km);
              break;
            case 2:
              Motoretta.hazCaballito();
              break;
            case 3:
              System.out.print("¿Cuantos kilometros quiere recorrer? ");
              km = s.nextInt();
              fiestaST.recorre(km);
              break;
            case 4:
              fiestaST.QuemaRueda();
              break;
            case 5:
              System.out.println("La bicicleta lleva recorridos ");
              System.out.println(Motoretta.getKilometrosRecorridos() + " Km");
              break;
            case 6:
              System.out.println("El coche lleva recorridos ");
              System.out.println(fiestaST.getKilometrosRecorridos() + " Km");
              break;
            case 7:
              System.out.println("Los vehiculos llevan recorridos ");
              System.out.println(fiestaST.getKilometrosTotales() + " Km");
            default:
        }
      }while(opcion != 8);
    }
    
}
