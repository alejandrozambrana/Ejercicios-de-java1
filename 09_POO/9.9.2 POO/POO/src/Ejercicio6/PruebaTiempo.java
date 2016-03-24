
package Ejercicio6;

import java.util.Scanner;

public class PruebaTiempo {

  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce una hora: ");
    int hora = s.nextInt();
    System.out.print("Introduce los minutos: ");
    int minutos = s.nextInt();
    System.out.print("Introduce los segundos: ");
    int segundos = s.nextInt();
    
    System.out.print("Introduce otra hora: ");
    int hora2 = s.nextInt();
    System.out.print("Introduce los minutos: ");
    int minutos2 = s.nextInt();
    System.out.print("Introduce los segundos: ");
    int segundos2 = s.nextInt();
    
    Tiempo T1 = new Tiempo(hora, minutos, segundos);
    Tiempo T2 = new Tiempo(hora2, minutos2, segundos2);
    
    System.out.println(T1 + " + " + T2 + " = " + T1.sumar(T2));
    System.out.println(T1 + " - " + T2 + " = " + T1.resta(T2));
  }
  
}
