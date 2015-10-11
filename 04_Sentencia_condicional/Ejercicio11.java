/**
 * Ejercicio 11 
 * Escribe un programa que dada una hora determinada (horas y minutos), 
 * calcule los segundos que faltan para llegar a la medianoche.
 *
 * @author Alejandro Zambrana Naranjo
 */

public class Ejercicio11 {
  public static void main(String[] args) {
  
    
    
    System.out.println("CALCULA CUANTO QUEDA PARA MEDIANOCHE ");
        
    System.out.print("Introduce la hora que es: ");
    int hora = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce los minutos: ");
    int minutos = Integer.parseInt(System.console().readLine());
    
    int segundosTranscurridos = (hora * 3600) + (minutos * 60);
    int segundosHastaMedianoche = (24 * 3600) - segundosTranscurridos;
    
      if ((hora < 24) && (minutos <= 60)){
        System.out.print("Quedan para medianoche " + (24 - hora) + ":"); 
        System.out.println(+ (60 - minutos) + " Horas");
      }
      if ((hora > 24) || (minutos > 60)) {
        System.out.println("La hora introducida es incorrecta");
      }
      System.out.print("Para la media noche quedan " + segundosHastaMedianoche);
      System.out.println( " segundos");
     }
    }

