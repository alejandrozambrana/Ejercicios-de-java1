
package Ejercicio7;

import java.util.Scanner;

public class Menu {

  public static void main(String[] args) {
   
    Scanner s = new Scanner(System.in);
    
    int opcion;
    int eligeZona;
    int numEntrada;
    
    Zona Principal = new Zona (1000);
    Zona compraVenta = new Zona (200);
    Zona vip = new Zona (25);
    
    do{
      System.out.println("1. Mostrar número de entradas libres");
      System.out.println("2. Vender entradas");
      System.out.println("3. Salir");
      System.out.print("Elige una opción: ");
      
      opcion = s.nextInt();
      
      switch(opcion){
        case 1:
          System.out.println();
          System.out.println("En la zona principal quedan: " + Principal.getEntradasPorVender());
          System.out.println("En la zona compra-venta quedan: " + compraVenta.getEntradasPorVender());
          System.out.println("En la zona vip quedan: " + vip.getEntradasPorVender());
          System.out.println();
          break;
        case 2:
          System.out.println();
          System.out.println("¿En que zona quieres las entradas?");
          System.out.println("1. Principal");
          System.out.println("2. Compra-venta");
          System.out.println("3. Vip");
          System.out.print("Elige una opción: ");
          eligeZona = s.nextInt();
          
          System.out.print("¿Cuantas entradas quieres?: ");
          numEntrada = s.nextInt();
          
          System.out.println();
          
          switch(eligeZona){
            case 1:
              Principal.vender(numEntrada);
              break;
            case 2:
              compraVenta.vender(numEntrada);
              break;
            case 3:
               vip.vender(numEntrada);
               break;
               default:
          }
          System.out.println();
          break;
          default:
      }
      
    }while(opcion !=3);
    
    if (opcion == 3){
      System.out.println();
      System.out.println("Gracia por su visita");
    }
  }
  
}
