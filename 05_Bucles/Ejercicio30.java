/**
 * Ejercicio 30 
 * Realiza una programa que calcule las horas transcurridas entre dos horas de dos 
 * días de la semana. No se tendrán en cuenta los minutos ni los segundos. El día de
 * la semana se puede pedir como un número (del 1 al 7) o como una cadena (de 
 * “lunes” a “domingo”). Se debe comprobar que el usuario introduce los datos 
 * correctamente y que el segundo día es posterior al primero. 
 * A continuación se muestra un ejemplo:
 *  Por favor, introduzca la primera hora.
 *  Día: lunes
 *  Hora: 18
 *  Por favor, introduzca la segunda hora.
 *  Día: martes
 *  Hora: 20
 *  Entre las 18:00h del lunes y las 20:00h del martes hay 26 hora/s
 * 
 * @author Alejandro Zambrana Naranjo
 */
 
public class Ejercicio30 {
  public static void main(String[] args) {
     
  System.out.println("ESTE PROGRAMA CALCULAS CUANTAS HORAS HAN PASADO DE UN DIA A OTRO");

    String primerdia;
    String segundodia;
    int horaprimerdia;
    int horasegundodia;
    String nombreprimerdia;
    String nombresegundodia;
    String primerdiaString;
    String segundodiaString;
    boolean datos = true;
    
    
    do{
      System.out.println("Primer dia: ");
      System.out.print("Dia: ");
      primerdiaString = System.console().readLine().toLowerCase();
      System.out.print("hora: ");
      horaprimerdia = Integer.parseInt(System.console().readLine());
      
      switch (primerdiaString){
        case "Lunes":
          nombreprimerdia = "Lunes";
          break;
        case "Martes":
          nombreprimerdia = "Martes";
          break;
        case "Miercoles":
          nombreprimerdia = "Miercoles";
          break;
        case "Jueves":
          nombreprimerdia = "Jueves";
         case "viernes":
          nombreprimerdia = "viernes";
          break;
        case "sábado":
          nombreprimerdia = "sábado";
          break;
        case "domingo":
          nombreprimerdia = "domingo";
          break;
        default:
          
      }
    
      System.out.println("Segundo dia: ");
      System.out.print("Dia: ");
      segundodiaString = System.console().readLine();
      System.out.print("hora: ");
      horasegundodia = Integer.parseInt(System.console().readLine());
    
      switch (segundodiaString){
        case "Lunes":
          nombresegundodia = "Lunes";
          break;
        case "Martes":
          nombresegundodia = "Martes";
          break;
        case "Miercoles":
          nombresegundodia = "Miercoles";
          break;
        case "Jueves":
          nombresegundodia = "Jueves";
         case "viernes":
          nombresegundodia = "viernes";
          break;
        case "sábado":
          nombresegundodia = "sábado";
          break;
        case "domingo":
          nombresegundodia = "domingo";
          break;
        default:
          
     }
     
     
  }
}


