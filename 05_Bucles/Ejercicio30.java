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

    int primerdia = 0;
    int segundodia = 0;
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
        case "1":
          primerdia = 1;
          nombreprimerdia = "Lunes";
          break;
        case "Martes":
        case "2":
          primerdia = 2;
          nombreprimerdia = "Martes";
          break;
        case "Miercoles":
        case "3":
          primerdia = 3;
          nombreprimerdia = "Miercoles";
          break;
        case "Jueves":
        case "4":
          primerdia = 4;
          nombreprimerdia = "Jueves";
         case "viernes":
        case "5":
          primerdia = 5;
          nombreprimerdia = "viernes";
          break;
        case "sábado":
        case "6":
          primerdia = 6;
          nombreprimerdia = "sábado";
          break;
        case "domingo":
        case "7":
          primerdia = 7;
          nombreprimerdia = "domingo";
          break;
        default:
        primerdia = 0;
      }
    
      System.out.println("Segundo dia: ");
      System.out.print("Dia: ");
      segundodiaString = System.console().readLine();
      System.out.print("hora: ");
      horasegundodia = Integer.parseInt(System.console().readLine());
    
      switch (segundodiaString){
        case "Lunes":
        case "1":
          segundodia = 1;
          nombresegundodia = "Lunes";
          break;
        case "Martes":
        case "2":
          segundodia = 2;
          nombresegundodia = "Martes";
          break;
        case "Miercoles":
        case "3":
          segundodia = 3;
          nombresegundodia = "Miercoles";
          break;
        case "Jueves":
        case "4":
          segundodia = 4;
          nombresegundodia = "Jueves";
         case "viernes":
        case "5":
          segundodia = 5;
          nombresegundodia = "viernes";
          break;
        case "sábado":
        case "6":
          segundodia = 6;
          nombresegundodia = "sábado";
          break;
        case "domingo":
        case "7":
          segundodia = 7;
          nombresegundodia = "domingo";
          break;
        default:
        segundodia = 0;
     }
     
      datos = true;
      
      if(segundodia <= primerdia){
        System.out.println("El segundo día debe ser posterior al primero.");
        datos = false;
      }
      
      if ((primerdia == 0) || (segundodia == 0)) {
        System.out.println("No se ha introducido correctamente el día de la semana.");  
        datos = false;
      }
      
      if ((horaprimerdia < 0) || (horaprimerdia > 23) || (horasegundodia < 0) || (horasegundodia > 23)) {
        System.out.println("No se ha introducido correctamente la hora del día.");
        datos = false;
      }
    } while (!datos);
    
    System.out.print("Entre las " + horaprimerdia + ":00h del " + primerdia);
    System.out.print(" y las " + horasegundodia + ":00h del " + segundodia);
    System.out.println(" hay " + (((segundodia * 24) + horasegundodia) - ((primerdia * 24) + horaprimerdia)) + " horas.");
  }
}


